package com.sourabh.animatable.animatable;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sourabh.animatable.R;
import com.sourabh.animatable.animatable.library.BaseViewAnimator;
import com.sourabh.animatable.animatable.library.attention.BounceAnimator;
import com.sourabh.animatable.animatable.library.attention.FlashAnimator;
import com.sourabh.animatable.animatable.library.attention.PulseAnimator;
import com.sourabh.animatable.animatable.library.attention.RubberBandAnimator;
import com.sourabh.animatable.animatable.library.attention.ShakeAnimator;
import com.sourabh.animatable.animatable.library.attention.StandUpAnimator;
import com.sourabh.animatable.animatable.library.attention.SwingAnimator;
import com.sourabh.animatable.animatable.library.attention.TadaAnimator;
import com.sourabh.animatable.animatable.library.attention.WaveAnimator;
import com.sourabh.animatable.animatable.library.attention.WobbleAnimator;
import com.sourabh.animatable.animatable.library.bouncing_entrances.BounceInAnimator;
import com.sourabh.animatable.animatable.library.bouncing_entrances.BounceInDownAnimator;
import com.sourabh.animatable.animatable.library.bouncing_entrances.BounceInLeftAnimator;
import com.sourabh.animatable.animatable.library.bouncing_entrances.BounceInRightAnimator;
import com.sourabh.animatable.animatable.library.bouncing_entrances.BounceInUpAnimator;
import com.sourabh.animatable.animatable.library.fading_entrances.FadeInAnimator;
import com.sourabh.animatable.animatable.library.fading_entrances.FadeInDownAnimator;
import com.sourabh.animatable.animatable.library.fading_entrances.FadeInLeftAnimator;
import com.sourabh.animatable.animatable.library.fading_entrances.FadeInRightAnimator;
import com.sourabh.animatable.animatable.library.fading_entrances.FadeInUpAnimator;
import com.sourabh.animatable.animatable.library.fading_exits.FadeOutAnimator;
import com.sourabh.animatable.animatable.library.fading_exits.FadeOutDownAnimator;
import com.sourabh.animatable.animatable.library.fading_exits.FadeOutLeftAnimator;
import com.sourabh.animatable.animatable.library.fading_exits.FadeOutRightAnimator;
import com.sourabh.animatable.animatable.library.fading_exits.FadeOutUpAnimator;
import com.sourabh.animatable.animatable.library.flippers.FlipInXAnimator;
import com.sourabh.animatable.animatable.library.flippers.FlipInYAnimator;
import com.sourabh.animatable.animatable.library.flippers.FlipOutXAnimator;
import com.sourabh.animatable.animatable.library.flippers.FlipOutYAnimator;
import com.sourabh.animatable.animatable.library.rotating_entrances.RotateInAnimator;
import com.sourabh.animatable.animatable.library.rotating_entrances.RotateInDownLeftAnimator;
import com.sourabh.animatable.animatable.library.rotating_entrances.RotateInDownRightAnimator;
import com.sourabh.animatable.animatable.library.rotating_entrances.RotateInUpLeftAnimator;
import com.sourabh.animatable.animatable.library.rotating_entrances.RotateInUpRightAnimator;
import com.sourabh.animatable.animatable.library.specials.RollInAnimator;
import com.sourabh.animatable.animatable.library.specials.RollOutAnimator;

public class Utils {
    public  static BaseViewAnimator getAnimationType(int animType, View target){
        BaseViewAnimator animation = null ;

        switch (animType){
            case AnimationType.bounceInRight:
                animation= new BounceInRightAnimator();
                break;
            case AnimationType.bounceInLeft:
                animation=new BounceInLeftAnimator();
                break;
            case AnimationType.bounceInUp:
                animation= new BounceInUpAnimator();
                break;
            case AnimationType.bounceInDown:
                animation= new BounceInDownAnimator();
                break;
            case AnimationType.flash:
                animation = new FlashAnimator();
                break;
            case AnimationType.rubberBand:
                animation= new RubberBandAnimator();
                break;
            case AnimationType.pulse:
                animation= new PulseAnimator();
                break;
            case AnimationType.swing:
                animation= new SwingAnimator();
                break;
            case AnimationType.wobble:
                animation= new WobbleAnimator();
                break;
            case AnimationType.tada:
                animation= new TadaAnimator();
                break;
            case AnimationType.standUp:
                animation= new StandUpAnimator();
                break;
            case AnimationType.wave:
                animation= new WaveAnimator();
                break;
            case AnimationType.shake:
                animation= new ShakeAnimator();
                break;
            case AnimationType.rollin:
                animation= new RollInAnimator();
                break;
            case AnimationType.rollOut:
                animation= new RollOutAnimator();
                break;
            case AnimationType.bounceIn:
                animation= new BounceInAnimator();
                break;
            case AnimationType.fadeInUp:
                animation= new FadeInUpAnimator();
                break;
            case AnimationType.fadeInDown:
                animation= new FadeInDownAnimator();
                break;
            case AnimationType.fadeInLeft:
                animation= new FadeInLeftAnimator();
                break;
            case AnimationType.fadeInRight:
                animation= new FadeInRightAnimator();
                break;
            case AnimationType.fadeOut:
                animation= new FadeOutAnimator();
                break;
            case AnimationType.fadeOutUp:
                animation= new FadeOutUpAnimator();
                break;
            case AnimationType.fadeOutDown:
                animation= new FadeOutDownAnimator();
                break;
            case AnimationType.fadeOutRight:
                animation= new FadeOutRightAnimator();
                break;
            case AnimationType.fadeOutLeft:
                animation= new FadeOutLeftAnimator();
                break;
            case AnimationType.flipInX:
                animation= new FlipInXAnimator();
                break;
            case AnimationType.flipInY:
                animation= new FlipInYAnimator();
                break;
            case AnimationType.flipOutX:
                animation= new FlipOutXAnimator();
                break;
            case AnimationType.flipOutY:
                animation= new FlipOutYAnimator();
                break;
            case AnimationType.rotateIn:
                animation= new RotateInAnimator();
                break;
            case AnimationType.rotateInDownLeft:
                animation= new RotateInDownLeftAnimator();
                break;
            case AnimationType.rotateInDownRight:
                animation= new RotateInDownRightAnimator();
                break;
            case AnimationType.rotateInUpLeft:
                animation= new RotateInUpLeftAnimator();
                break;
            case AnimationType.rotateInUpRight:
                animation= new RotateInUpRightAnimator();
                break;
                default:
                    animation= new BounceAnimator();
        }
        animation.setTarget(target);
        return animation;
    }
}
