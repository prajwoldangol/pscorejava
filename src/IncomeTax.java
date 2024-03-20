import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String status = "" ;
        double income = 0 ;
        // array of filing status MFJ and QW represent same index as it has same taxbrackets
        String[] filingStatus = {"S","MFJ", "MFS", "H","QW"} ;
        // tax rates
        int[] taxRates = {10,15,25,28,33,35};
        // income limits 2d array each inner array belongs to index of filing status
        double[][] taxBracket = {
                {8350,33950,82250,171550,372950,372951},
                {16700,67900,137050,208850,372950,372951},
                {8350,33950,68525,104425,186475,186476},
                {11950,45500,117450,190200,372950,372951}
        } ;

        System.out.println(" Enter your filing status" );
        System.out.println(" #Enter \"S\" for Single, \n #Enter \"MFJ\" for Married Filing Jointly, \n #Enter " +
                "\"MFS\" for Married Filing Separately, \n #Enter \"QW\" for Qualifying Widower, and  \n #Enter \"H\" for Head of Household.");
        while(!valid){

                status = input.next();
                status = status.toUpperCase();
                // check if valid filing status is entered by user
                for( String s : filingStatus) {
                    if (status.equals(s)) {
                        valid = true;
                        break;
                    }
                }
            if( !valid ){
                System.out.println("Invalid  Filing Status !! Enter Again !!");
                System.out.println(" #Enter \"S\" for Single, \n #Enter \"MFJ\" for Married Filing Jointly, \n #Enter " +
                        "\"MFS\" for Married Filing Separately, \n #Enter \"QW\" for Qualifying Widower, and  \n #Enter \"H\" for Head of Household.");
                input.nextLine();
            }

        }
        //set the valid flag to false for reusing same variable to check valid income again
        valid = false ;
        System.out.println("Enter Your Income From last year !!");

        while ( ! valid ) {
            if( input.hasNextDouble()){
                income = input.nextDouble();
                valid = true ;

            }else{

                System.out.println("Error !! !! Income should be a number !!");
                input.next();

            }
        }

        switch(status){
            case "S" :
                for( int i = 0; i < taxBracket[0] .length ; i++){
                    if( income <= taxBracket[0][i]){

                        System.out.println(" Your Tax Rate is " + taxRates[i] + " %");
                        System.out.println(" You Will Pay $" + taxRates[i] * income / 100 + " in taxes" );
                        return;
                    }
                }
                break;
            case "MFJ" :
            case "QW" :
                for( int i = 0; i < taxBracket[1] .length ; i++){
                    if( income <= taxBracket[1][i]){
                        System.out.println(" Your Tax Rate is " + taxRates[i] + " %");
                        System.out.println(" You Will Pay $" + taxRates[i] * income / 100 + " in taxes" );
                        return;
                    }
                }
                break ;
            case "MFS" :
                for( int i = 0; i < taxBracket[2] .length ; i++){
                    if( income <= taxBracket[2][i]){

                        System.out.println(" Your Tax Rate is " + taxRates[i] + " %");
                        System.out.println(" You Will Pay $" + taxRates[i] * income / 100 + " in taxes" );
                        return;
                    }
                }

                break ;
            case "H" :
                for( int i = 0; i < taxBracket[3] .length ; i++){
                    if( income <= taxBracket[3][i]){
                        System.out.println(" Your Tax Rate is " + taxRates[i] + " %");
                        System.out.println(" You Will Pay $" + taxRates[i] * income / 100 + " in taxes" );
                        return;
                    }
                }
                break ;
            default:
                System.out.println(" Problem Finding Tax Rate !! ");

        }
        input.close();


    }
}
