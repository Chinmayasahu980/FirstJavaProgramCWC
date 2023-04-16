/*Define an interface “StackOperations” which declares methods for a static stack. Define a
class “MyStack” which contains an array and top as data members and implements the above
interface. Initialize the stack using a constructor. Write a menu driven program to perform
 push, pop and peek operations on a stack object.*/

package com.chinmaya;
    interface IntStack {
        void push(int item);
        int pop();
    }

    class FixedStack implements IntStack
    {	private int stack[ ];  private int top;
        FixedStack(int size)  { 	stack = new int[size]; top=-1;  }

        public void push(int item)
        {	if(top == stack.length-1) System.out.println("Stack Full");
        else  stack[++top] = item;
        }
        public int pop( )
        {   	if(top < 0)
        {  	System.out.println("Stack underflow");  return 0;
        }
        else  return stack[top--];
        }
    }
    class DynamicStack implements IntStack
    {	private int stack[ ];  private int top;

        DynamicStack(int size) { stack = new int[size]; }

        public void push(int item)
        {	if(top == stack.length-1)
        {	int temp[] = new int[stack.length*2];  //double size
            for(int i=0; i<stack.length; i++)
                temp[i] = stack[i];
            stack=temp;
            stack[++top] = item;
        }
        else  stack[++top] = item;
        }
        public int pop( )
        {	if(top < 0)
        {	System.out.println("Stack underflow");  return 0;
        }
        else  return stack[top--];
        }
    }
    class  l6Q2
    {	public static void main(String arg[])
    {	IntStack mystack;
        DynamicStack ds = new DynamicStack(3);
        FixedStack fs = new FixedStack(3);
        mystack=ds;
        for(int i=1; i<=5; i++) mystack.push(i);
        mystack=fs;
        for(int i=1; i<=7; i++) mystack.push(i);
        mystack=ds;
        System.out.println("Stack in Dynamic Stack : ");
        for(int i=1; i<=5; i++)
            System.out.println(mystack.pop());
        mystack=fs;
        System.out.println("Stack in Fixed Stack : ");
        for(int i=1; i<=7; i++)
            System.out.println(mystack.pop());
    }
    }

