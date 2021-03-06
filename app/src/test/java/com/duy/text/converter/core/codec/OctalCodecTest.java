/*
 * Copyright (c) 2018 by Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.text.converter.core.codec;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Duy on 2/10/2018.
 */
public class OctalCodecTest {
    private static final String TO_BE_ENCODE = "OctalCodecTest";
    private static final String TO_BE_DECODE = "117 143 164 141 154 103 157 144 145 143 124 145 163 164";
    private OctalCodec codec = new OctalCodec();

    @Test
    public void encode() throws Exception {
        Assert.assertEquals(codec.encode(TO_BE_ENCODE), TO_BE_DECODE);
    }

    @Test
    public void decode() throws Exception {
        Assert.assertEquals(codec.decode(TO_BE_DECODE), TO_BE_ENCODE);
    }

    @Test
    public void encodeUtf16() {
        String utf16Str = AsciiCodecTest.UTF_16_STR;
        String encode = codec.encode(utf16Str);
        assertEquals("372247", encode);
    }

    @Test
    public void decodeUtf16() {
        String utf16Str = AsciiCodecTest.UTF_16_STR;
        String encode = codec.encode(utf16Str);
        assertEquals(utf16Str, codec.decode(encode));
    }
}