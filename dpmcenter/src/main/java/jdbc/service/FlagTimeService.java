package jdbc.service;

import jdbc.inf.FlagTimeServiceIf;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by limin.llm on 2014/10/26.
 */
public class FlagTimeService implements FlagTimeServiceIf {
    private int beforeMinute = -1;

    public int getBeforeMinute() {
        return beforeMinute;
    }

    public void setBeforeMinute(int beforeMinute) {
        this.beforeMinute = beforeMinute;
    }

    /**
     * 目前，我们实现获取前1分钟的增量数据
     *
     * @return
     */
    public String getFlagTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, beforeMinute);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sf.format(calendar.getTime());
        return str;
    }
}
