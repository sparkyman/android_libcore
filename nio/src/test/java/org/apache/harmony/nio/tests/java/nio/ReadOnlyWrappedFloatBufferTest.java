/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.harmony.nio.tests.java.nio;

import dalvik.annotation.TestTargetClass;

import java.nio.FloatBuffer;

@TestTargetClass(java.nio.FloatBuffer.class)
public class ReadOnlyWrappedFloatBufferTest extends ReadOnlyFloatBufferTest {

    protected void setUp() throws Exception {
        super.setUp();
        capacity = BUFFER_LENGTH;
        buf = FloatBuffer.wrap(new float[BUFFER_LENGTH]);
        super.loadTestData1(buf);
        buf = buf.asReadOnlyBuffer();
        baseBuf = buf;
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
