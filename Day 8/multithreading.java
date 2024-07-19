class multithreading extends Thread{
    public void run()
    {
    
        System.out.println("Thread is running...");
    }
        public static void main(String[] args) {
            int n=5;
            for(int i=0;i<n;i++)
            {
                multithreading t1=new multithreading();
                t1.start();

            }
        }
    }

