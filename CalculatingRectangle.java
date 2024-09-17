
public class CalculatingRectangle {
    public static void main(String[] args) {
        //Define the Dimensions
        int length = 20;// length, in meters
        int width = 15; //  width in meters
        
        //Display the area
        
        System.out.println("The length of the Garden is " + length);
        System.out.println("The width of the Garden is " + width);
       
        //Method in Calculating 
            
        int area = length * width;
        int perimeter = 2 * (length + width);

        //Display the output

        System.out.println("The area of the Garden is " + area );
        System.out.println("The perimeter of the Garden is " + perimeter);
            

    }    
    
}
   
