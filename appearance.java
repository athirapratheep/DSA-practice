public static int appearance(int[] digits)
    {
        int result=0;
        for(int num:digits)
        {
            result^=num;
        }
        return result;
    }
