package com.bear.controller;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class DateUtil {

        public static void main(String[] args) {
            isThisMonth(1416360654000L);
        }

        //判断选择的日期是否是本周
        public static boolean isThisWeek(long time)
        {
            Calendar calendar = Calendar.getInstance();
            int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);
            calendar.setTime(new Date(time));
            int paramWeek = calendar.get(Calendar.WEEK_OF_YEAR);
            if(paramWeek==currentWeek){
                return true;
            }
            return false;
        }
        //判断选择的日期是否是今天
        public static boolean isToday(long time)
        {
            return isThisTime(time,"yyyy-MM-dd");
        }
        //判断选择的日期是否是本月
        public static boolean isThisMonth(long time)
        {
            return isThisTime(time,"yyyy-MM");
        }
        private static boolean isThisTime(long time,String pattern) {
            Date date = new Date(time);
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            String param = sdf.format(date);//参数时间
            String now = sdf.format(new Date());//当前时间
            if(param.equals(now)){
                return true;
            }
            return false;
        }


        public void testTime(){
            isToday(1416360654000L);
            isThisMonth(1416360654000L);
            isThisWeek(1416360654000L);
        }

}
