package Threads;
import java.util.*;

class Connection {}

class ConnectionPool {
    private final Queue<Connection> pool = new LinkedList<>();

    public ConnectionPool(int size) {
        for (int i = 0; i < size; i++) pool.add(new Connection());
    }

    public synchronized Connection getConnection() throws InterruptedException {
        while (pool.isEmpty()) {
            wait();
        }
        return pool.poll();
    }

    public synchronized void releaseConnection(Connection conn) {
        pool.add(conn);
        notify();
    }
}

class Worker extends Thread {
    ConnectionPool pool;

    Worker(ConnectionPool pool) {
        this.pool = pool;
    }

    public void run() {
        try {
            Connection conn = pool.getConnection();
            System.out.println(Thread.currentThread().getName() + " got connection");
            Thread.sleep(1000);
            pool.releaseConnection(conn);
            System.out.println(Thread.currentThread().getName() + " released connection");
        } catch (Exception e) { e.printStackTrace(); }
    }
}

public class ThreadsafeConnectionPool{
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(2);
        for (int i = 0; i < 5; i++) new Worker(pool).start();
    }
}