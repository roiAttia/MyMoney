package roiattia.com.mymoney.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import butterknife.BindView
import butterknife.ButterKnife
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import roiattia.com.mymoney.R

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.dashboard -> {
                findNavController(R.id.navHost).navigate(R.id.dashboard_dest)
                return@OnNavigationItemSelectedListener true
            }
            R.id.income -> {
                findNavController(R.id.navHost).navigate(R.id.income_dest)
                return@OnNavigationItemSelectedListener true
            }
            R.id.expense -> {
                findNavController(R.id.navHost).navigate(R.id.expense_dest)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    @BindView(R.id.bottomNavigation) lateinit var bottomMenu : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        bottomMenu.setOnNavigationItemSelectedListener ( mOnNavigationItemSelectedListener )
    }
}
