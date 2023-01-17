package come.example.cupcake.test
//
//import androidx.activity.ComponentActivity
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.test.junit4.createAndroidComposeRule
//import androidx.navigation.compose.ComposeNavigator
//import com.example.cupcake.CupcakeApp
//import org.junit.Rule
//
//class CupcakeScreenNavigationTest {
//    @get:Rule
//    val composeTestRule = createAndroidComposeRule<ComponentActivity>()
//    private lateinit var navController: TestNavHostController
//    fun setupCupcakeNavHost() {
//        composeTestRule.setContent {
//            navController =
//                TestNavHostController(LocalContext.current)
//            navController.navigatorProvider.addNavigator(
//                ComposeNavigator()
//            )
//            CupcakeApp(navController = navController)
//        }
//    }
//}