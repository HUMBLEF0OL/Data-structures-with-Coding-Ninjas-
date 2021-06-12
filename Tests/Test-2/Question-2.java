/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *

  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/

public class Dequeue {
    // Complete this class

    private int[] data;
    private int front;
    private int rear;
    private int size;
    
    public Dequeue(int capacity)
    {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    
    private boolean isEmpty()
    {
        return size == 0;
    }
    
    public void insertFront(int data)
    {
        if(size == this.data.length)
        {
            System.out.println(-1);
            return;
        }
        if(isEmpty())
        {
            front = rear = 0;
        }
        else if(front == 0)
        {
            front = (this.data.length - front - 1) % this.data.length;
        }
        else
        {
            front = front - 1;
        }
        this.data[front] = data;
        size++;
    }
    
    public void insertRear(int data)
    {
        if(size == this.data.length)
        {
            System.out.println(-1);
            return;
        }
        if(isEmpty())
        {
            front = rear = 0;
        }
        else
        {
            rear = (rear + 1) % this.data.length;
        }
        this.data[rear] = data;
        size++;
    }
    
    public int getFront()
    {
        if(isEmpty())
            return -1;
        return data[front];
    }
    
    public int getRear()
    {
        if(isEmpty())
            return -1;
        return data[rear];
    }
    
    public void deleteFront()
    {
        if(isEmpty())
        {
            System.out.println(-1);
            return;
        }
        if(front == rear)
        {
            front = rear = -1;
        }
        else
        {
            front = (front + 1) % data.length;
        }
        size--;
    }
    
    public void deleteRear()
    {
        if(isEmpty())
        {
            System.out.println(-1);
            return;
        }
        if(front == rear)
        {
            front = rear = -1;
        }
        else if(rear == 0)
        {
            rear = data.length - 1;
        }
        else
        {
            rear = rear - 1;
        }
        size--;
    }


}
