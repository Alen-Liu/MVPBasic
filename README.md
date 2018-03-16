/**
 * Created by Alen on 2018/2/9.
 *  Android 开发包含很多内容：
 *  图片加载以及优化、列表展示以及优化（包含下拉，上滑加载，分页加载）、网络请求、自定义View、
 *  MVP/MVC/MVVM 基本框架、 GreenDao数据库、 事件EventBus、打点、热更新、打包/渠道、加固等等。
 *
 * 1. 自定义 Application 对象
 * 2. 为了防止以后项目过大，导致方法数超过64K（很常见，因为需要加载很多其他的框架）建议使用MultiDex
 *    使用方法：（1） 在build.gradle 中 设置MultiDex可用 （2）depends中加入MultiDex的依赖 (3) APP继承MultiDexApplication
 *    plus: 使用MultiDex 可能会有一些坑， 这些以后在遇到的时候 自己要注意。这都是因为android 过于碎片化导致的。
 *          分包是一个比较好的技术前沿方向。很多技术公司都在研究这块的技术
 *  3. MVP + Retrofit + Dagger + RxJava 框架进行页面和网络请求的布局
 *     页面文件在Module下   MVP 页面包含使用ButterKnife 和Lambda的依赖
 *     （1） 在build.gradle中添加 ButterKnife 、 Lambda 、 Dagger 的依赖
 *     （2） 每一个页面都分别添加  xxActivity、xxContract、xxPresenter、xxPresenterComponent、xxPresenterModule
 *     （3） 在build.gradle中加入 Retrofit 和 RxJava的依赖
 *     （4） 在App.java中 插入网络请求对象,  具体的网络请求的示例可以参考SplashActivity中的代码。
 *
 *  4. 图片加载最好使用Glide。 （1）在Build.gradle中添加Glide的依赖。
 *      （2）在manifest中设置GlideModule
 *      注意：使用Glide加载图片的控件  不能直接使用 setTag（x）， 需要用setTag(x, xx)
 *  5. RecyclerView  很多都需要  上拉和下滑加载动画  一起使用
 *     https://github.com/Aspsine/IRecyclerView
 *
 *  6. 很多人都喜欢用EventBus， 这里我使用以前项目组的人自己写的一个EventCenterManager
 *      （1） 需要在App 初始化的时候进行一个init
 *
 *  7. 个人喜欢用GreenDao 来代替sqlLite3，因为大部分是互联网应用，数据主要来自网络后台。
 *      （1） 在build.gradle 中引入依赖
 *      （2） 设置GreenDao自定义路径
 *      （3） 创建一个实体，可以参考.DBUnity/Book
 *      （4） 在App里面初始化GreenDaoManager
 *
 *  8. 可以使用productFlavors进行多渠道打包， 这个方式配置简单，但是打包速度比较慢。
 *     在build.gradle中进行配置就可以了
 */
