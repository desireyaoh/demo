# Demo

一个基于 **Kotlin + MVVM + XML** 的 Android 示例项目，包名为 `com.example.demo`。

## 功能概览

- **Splash 启动页**：应用启动后展示启动页，延时 5 秒后自动跳转到主界面
- **主界面 (MainActivity)**：展示 "Hello World" 文本

## 技术栈

| 层级   | 技术选型                              |
| ------ | ------------------------------------- |
| 语言   | Kotlin 1.9.22                         |
| 架构   | MVVM（Model-View-ViewModel）          |
| 布局   | XML + ViewBinding                     |
| 异步   | Kotlin Coroutines + Flow              |
| 构建   | Gradle Kotlin DSL (AGP 8.2.2)         |
| 最低版本 | minSdk 26，targetSdk / compileSdk 34 |

## 项目结构

```
app/src/main/
├── AndroidManifest.xml
├── java/com/example/demo/
│   └── ui/
│       ├── main/
│       │   ├── MainActivity.kt      # 主界面
│       │   └── MainViewModel.kt     # 主界面 ViewModel
│       └── splash/
│           └── SplashActivity.kt    # 启动页
└── res/
    ├── layout/
    │   ├── activity_main.xml        # 主界面布局
    │   └── activity_splash.xml      # 启动页布局
    └── values/                      # 颜色、字符串、主题
```

## 构建与运行

> ⚠️ 首次使用前需生成 Gradle Wrapper：在 Android Studio 中执行 **Sync Project with Gradle Files**，或在已安装 Gradle 的环境中运行 `gradle wrapper`。

```bash
# 清理构建
./gradlew clean

# 构建 Debug APK
./gradlew assembleDebug

# 安装到已连接设备
./gradlew installDebug

# 运行 Lint 检查
./gradlew lintDebug
```

## 架构约定

- **按特性分包**：同一特性的 `Activity` / `Fragment` / `ViewModel` 放在同一包内（如 `ui.main`、`ui.splash`）
- **单向数据流**：`ViewModel` 通过 `MutableStateFlow` + `StateFlow` 暴露状态，`Activity` / `Fragment` 在 `repeatOnLifecycle` 中收集
- **视图访问**：统一使用 **ViewBinding**，禁止使用 `findViewById`

## License

```
Copyright (c) 2026
```
