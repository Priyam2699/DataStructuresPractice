public class Testing {


    public static void main(String[] args) {


        String s = "ne2ds";




        for(int i = 1; i<s.length(); i++)
        {

            if(s.charAt(i)=='2')
            {




                s.replace('2',s.charAt(i-1));
                System.out.println(s.charAt(i-1));

            }


        }


        System.out.println(s);

    }


}
