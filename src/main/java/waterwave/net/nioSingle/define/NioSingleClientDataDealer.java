/*
 * Licensed to waterwave under one or more contributor
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package waterwave.net.nioSingle.define;

import java.nio.ByteBuffer;

import waterwave.net.nioSingle.NioSingleClientChannel;


public interface NioSingleClientDataDealer {

    
	void clientBeforeRead(NioSingleClientChannel channel);
	void clientOnConnect(NioSingleClientChannel channel);
	void clientOnData(NioSingleClientChannel channel, ByteBuffer b, int bytes);
	void clientAfterWrite(NioSingleClientChannel channel, ByteBuffer buffer, int bytes);
	void clientOnError(NioSingleClientChannel channel,Throwable exc, ByteBuffer attachment);
    void clientOnClose(NioSingleClientChannel channel);

	boolean clientAcceptsMessages();
	
}
