package io.netty.example.com.sx;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.PooledByteBufAllocator;

/**
 * created at 2019/10/21
 *
 * @author shixi
 */
public class Memory {
    public static void main(String[] args) {

        ByteBufAllocator byteBufAllocator = PooledByteBufAllocator.DEFAULT;
        ByteBuf buffer = byteBufAllocator.buffer(1024);
        ByteBuf buffer1 = byteBufAllocator.buffer(15);
        ByteBuf buffer2 = byteBufAllocator.buffer(17);
        buffer.writeInt(123);
        System.out.println(buffer.readInt());
        buffer.release();
    }
}
