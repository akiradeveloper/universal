package sri.universal.apis

import sri.core.{JSComponent, ReactClass}
import sri.universal.XYValueLiteral
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{undefined, |, UndefOr => U}

@js.native
@JSImport("react-native", "Animated.Text")
object AnimatedTextComponent extends JSComponent[TextProps]

@js.native
trait Animated extends js.Object {
  val View: ReactClass = js.native
  val Text: ReactClass = js.native
  val Image: ReactClass = js.native
  val ScrollView: ReactClass = js.native

  def decay(value: AnimatedValue | AnimatedValueXY,
            config: DecayAnimationConfig): CompositeAnimation = js.native

  def timing(value: AnimatedValue | AnimatedValueXY,
             config: TimingAnimationConfig): CompositeAnimation = js.native

  def spring(value: AnimatedValue | AnimatedValueXY,
             config: SpringAnimationConfig): CompositeAnimation = js.native

  def add(a: Animated | Double, b: Animated | Double): AnimatedAddition =
    js.native

  def divide(a: Animated | Double, b: Animated | Double): AnimatedDivision =
    js.native

  def multiply(a: Animated | Double,
               b: Animated | Double): AnimatedMultiplication = js.native

  def modulo(a: Animated, modulo: Double): AnimatedModulo = js.native

  def diffClamp(a: Animated, min: Double, max: Double): AnimatedModulo =
    js.native

  def delay(time: Double): CompositeAnimation = js.native

  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation =
    js.native

  def parallel(animations: js.Array[CompositeAnimation],
               config: AnimatedParallelConfig = ???): CompositeAnimation =
    js.native

  def stagger(time: Double,
              animations: js.Array[CompositeAnimation]): CompositeAnimation =
    js.native

  def event(argMapping: js.Array[js.Dictionary[js.Object] | AnimatedValue],
            config: AnimatedEventConfig = ???): Any = js.native

  def createAnimatedComponent(Component: js.Any): js.Any = js.native

}

@js.native
@JSImport("react-native", "Animated")
object Animated extends Animated

trait AnimatedParallelConfig extends js.Object {
  var stopTogether: U[Boolean] = undefined
}

trait AnimatedEventConfig extends js.Object {
  var listener: U[js.Function] = undefined
  var useNativeDriver: U[Boolean] = undefined
}

@js.native
trait AnimatedDivision extends js.Object

@js.native
trait AnimatedMultiplication extends js.Object

@js.native
trait AnimatedModulo extends js.Object

@js.native
trait AnimatedDiffClamp extends js.Object

@js.native
trait AnimatedEndResult extends js.Object {
  val finished: Boolean = js.native
}

@js.native
trait CompositeAnimation extends js.Object {
  def stop(): Unit = js.native

  def start(callback: AnimatedEndResult => _ = ???): Unit = js.native
}

trait AnimatedConfig extends js.Object {
  var isInteraction: U[Boolean] = undefined
  var useNativeDriver: U[Boolean] = undefined
  var onComplete: U[js.Function1[AnimatedEndResult, _]] = undefined
}

trait DecayAnimationConfig extends AnimatedConfig {

  var velocity: U[Double | XYValueLiteral] = undefined

  var deceleration: U[Double] = undefined
}

trait TimingAnimationConfig extends AnimatedConfig {
  var toValue: U[Double | AnimatedValue | XYValueLiteral | AnimatedValueXY] =
    undefined
  var easing: U[js.Function1[Double, Double]] = undefined
  var duration: U[Double] = undefined
  var delay: U[Double] = undefined
}

trait SpringAnimationConfig extends AnimatedConfig {
  var toValue: U[Double | AnimatedValue | XYValueLiteral | AnimatedValueXY] =
    undefined
  var overshootClamping: U[Boolean] = undefined
  var restDisplacementThreshold: U[Double] = undefined
  var restSpeedThreshold: U[Double] = undefined
  var velocity: U[Double | XYValueLiteral] = undefined
  var bounciness: U[Double] = undefined
  var speed: U[Double] = undefined
  var tension: U[Double] = undefined
  var friction: U[Double] = undefined
}

@js.native
trait AnimatedAddition extends js.Object

@js.native
@JSImport("react-native", "Animated.Value")
class AnimatedValue(value: Double) extends js.Object {

  def setValue(value: Double): Unit = js.native

  def setOffset(value: Double): Unit = js.native

  def flattenOffset(): Unit = js.native

  def extractOffset(): Unit = js.native

  def addListener(callback: js.Dynamic => _): String = js.native

  def removeListener(id: String): Unit = js.native

  def removeAllListeners(): Unit = js.native

  def stopAnimation(callback: js.Dynamic => _ = ???): Unit = js.native

  def interpolate(config: AnimatedInterpolationConfig): AnimatedInterpolation =
    js.native

  def animate(animation: Animation, callback: js.Dynamic => _): Unit =
    js.native

  def stopTracking(): Unit = js.native

  def track(tracking: Animated): Unit = js.native

}

trait AnimatedValueXYValue extends js.Object {
  var x: Double | AnimatedValue
  var y: Double | AnimatedValue
}

@js.native
@JSImport("react-native", "Animated.ValueXY")
class AnimatedValueXY(valueIn: AnimatedValueXYValue = ???) extends js.Object {

  def setValue(value: XYValueLiteral): Unit = js.native

  def setOffset(value: XYValueLiteral): Unit = js.native

  def flattenOffset(): Unit = js.native

  def removeAllListeners(): Unit = js.native

  def stopAnimation(callback: XYValueLiteral => _ = ???): Unit = js.native

  def addListener(callback: XYValueLiteral => _): String = js.native

  def removeListener(id: String): Unit = js.native

  def getLayout(): js.Dictionary[AnimatedValue] = js.native

  def getTranslateTransform(): js.Array[js.Dictionary[AnimatedValue]] =
    js.native

}

@js.native
trait Animation extends js.Object

@js.native
trait AnimatedInterpolation extends js.Object {

  def interpolate(config: AnimatedInterpolationConfig): AnimatedInterpolation =
    js.native

}

trait AnimatedInterpolationConfig extends js.Object {
  var inputRange: js.Array[Double]
  var outputRange: js.Array[Double] | js.Array[String]
  var easing: U[Double => Double] = undefined
  var extrapolate: U[AnimatedInterpolationExtrapolate] = undefined
  var extrapolateLeft: U[AnimatedInterpolationExtrapolate] = undefined
  var extrapolateRight: U[AnimatedInterpolationExtrapolate] = undefined
}

@js.native
trait AnimatedInterpolationExtrapolate extends js.Object

object AnimatedInterpolationExtrapolate {

  val EXTEND = "extend".asInstanceOf[AnimatedInterpolationExtrapolate]

  val IDENTITY = "identity".asInstanceOf[AnimatedInterpolationExtrapolate]

  val CLAMP = "clamp".asInstanceOf[AnimatedInterpolationExtrapolate]

}
