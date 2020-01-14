package com.wanjf.uac

import org.jetbrains.annotations.NotNull

class WordUtils {

    companion object {

        /**
         * 判断是否是中文字符串
         */
        fun isChinese(@NotNull c: Char) : Boolean {
            var cu: Character.UnicodeBlock? = Character.UnicodeBlock.of(c)
            return cu === Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                    || cu === Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                    || cu === Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                    || cu === Character.UnicodeBlock.GENERAL_PUNCTUATION
                    || cu === Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                    || cu === Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
        }
    }
}