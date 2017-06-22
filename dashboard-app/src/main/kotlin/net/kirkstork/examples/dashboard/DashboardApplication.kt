package net.kirkstork.examples.dashboard

import tornadofx.*
import tornadofx.osgi.ApplicationProvider
import kotlin.reflect.KClass

class DashboardApplication : App(DashboardView::class, Styles::class)

class AppRegistration : ApplicationProvider {
	override val application = DashboardApplication::class
}
