//circular queue
public class circular_queue
 {
    int size=4;
    int[] Queue=new int[size];
    int front=0;
    int rear=0;
    int count=0;
    int Enqueue(int num)
    {
        if(rear==size)
        {
            System.out.println("Queue is full");
        }
        else
        {
            Queue[rear]=num;
            rear=(rear+1)%size;
            count++;
        }
        return 0;
    }

    void Dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            
        }
        else
        {
            int data=Queue[front];
            front=(front+1)%size;
            count--;
        }
    }

    boolean isEmpty()
    {
        return count==0;
    }

    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(Queue[i]+" ");
        }
    }
}
class Main{

    public static void main(String[] args) {
        circular_queue cq=new circular_queue();
        cq.Enqueue(10);
        cq.Enqueue(20);
        cq.Enqueue(30);
        cq.Enqueue(40);
        cq.Enqueue(50);
        cq.Enqueue(60);
        cq.display();

    }
}

