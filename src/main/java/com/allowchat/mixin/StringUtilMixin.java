package com.allowchat.mixin;

import net.minecraft.util.StringUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(StringUtil.class)
public class StringUtilMixin {
    @Inject(at = @At("HEAD"), method = "isAllowedChatCharacter", cancellable = true)
    private static void isAllowedChatCharacter(CallbackInfoReturnable<Boolean> cir) {
       cir.setReturnValue(true);
    }
}
