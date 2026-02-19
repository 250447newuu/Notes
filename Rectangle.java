public class Rectangle {
        private double length;
        private double width;
        Rectangle(){
            this.length=1.0;
            this.width=1.0;
        }
    Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }
    void setLength(double length){
            if(length>=0.0 && length<=20.0){
                this.length=length;
            }else{
                System.out.println("Invalid lenght!!!");
            }
        }
        void setWidth(double width){
            if(width>=0.0 && width<=20.0) {
                this.width=width;
            }else{
                System.out.println("Invalid width");
            }
        }
        double getLength(){
            return length;
        }
        double getWidth(){
            return width;
        }
        double calculateArea(){
            return length*width;
        }
        double calculatePerimeter(){
            return 2*(length+width);
        }
}
