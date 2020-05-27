package cc.huanmei.httpwww.myapplication.application

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import cc.huanmei.httpwww.myapplication.R
import com.scwang.smart.refresh.footer.BallPulseFooter
import com.scwang.smart.refresh.header.MaterialHeader
import com.scwang.smart.refresh.layout.SmartRefreshLayout


/**
 * Created by Administrator on 2018/2/5 0005.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SmartRefreshLayout.setDefaultRefreshHeaderCreator { context, layout ->
            layout.setPrimaryColorsId(R.color.my_color, R.color.white)//全局设置主题颜色
            MaterialHeader(context)//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header
        }
        SmartRefreshLayout.setDefaultRefreshFooterCreator { context, _ ->
            BallPulseFooter(context)
        }
    }

    companion object {
        fun getCurProcessName(context: Context): String? {
            val pid = android.os.Process.myPid()
            val activityManager =
                context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            for (appProcess in activityManager.runningAppProcesses) {
                if (appProcess.pid == pid) {
                    return appProcess.processName
                }
            }
            return null
        }
    }

}
