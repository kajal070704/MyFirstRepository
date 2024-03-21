package DSASORT;
import java.util.Scanner;

public class QUEUE {
	static int maxsize=5;
	int front = -1, rear = -1;  
	int queue[]= new int[maxsize];  
	private void  test()  
	{  
	    int choice=0;   
	    while(choice != 4)   
	    {     
	        System.out.println("*************************Main Menu*****************************");    
	        System.out.println("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");  
	        System.out.println("Enter your choice ?");  
	        Scanner sc= new Scanner(System.in);
	       choice=sc.nextInt();
	       switch(choice)  
	        {  
	            case 1:  
	            insert();  
	            break;  
	            case 2:  
	            delete();  
	            break;  
	            case 3:  
	            display();  
	            break;  
	            case 4:  
	            return;  
	             
	            default:   
	            	System.out.println("\nEnter valid choice??\n");  
	        }  
	    }  
	}  
	void insert()  
	{  
	    int item;  
	    System.out.println("Enter the element");  
	    item= (new Scanner(System.in)).nextInt();      
	    if(rear == maxsize-1)  
	    {  
	    	System.out.println("OVERFLOW\n");  
	        return;  
	    }  
	    if(front == -1 && rear == -1)  
	    {  
	        front = 0;  
	        rear = 0;  
	    }  
	    else   
	    {  
	        rear = rear+1;  
	    }  
	    queue[rear] = item;  
	    System.out.println("Value inserted ");  
	      
	}  
	void delete()  
	{  
	    int item;   
	    if (front == -1 || front > rear)  
	    {  
	    	System.out.println("Uunderflowww");  
	        return;  
	              
	    }  
	    else  
	    {  
	        item = queue[front];  
	        if(front == rear)  
	        {  
	            front = -1;  
	            rear = -1 ;  
	        }  
	        else   
	        {  
	            front = front + 1;  
	        }  
	        System.out.println("value deleted ");  
	    }  
	      
	      
	}  
	void display()  
	{  
	    int i;  
	    if(rear == -1)  
	    {  
	       System.out.println ("Empty queue");  
	    }  
	    else  
	    {   System.out.println("printing values .....");  
	        for(i=front;i<=rear;i++)  
	        {  
	        	System.out.print(queue[i]+" ");  
	        }     
	        
	    }  
	    System.out.println();
	}  
	public static void main(String[] args) {
		QUEUE queue= new QUEUE();
		queue.test();
	}
 
}
