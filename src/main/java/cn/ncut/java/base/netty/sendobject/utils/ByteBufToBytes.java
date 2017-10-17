package cn.ncut.java.base.netty.sendobject.utils;

import io.netty.buffer.ByteBuf;

public class ByteBufToBytes {
    /**
     * 将ByteBuf转换为byte[]
     */
    public byte[] read(ByteBuf datas) {
        byte[] bytes = new byte[datas.readableBytes()];// 创建byte[]
        datas.readBytes(bytes);// 将ByteBuf转换为byte[]
        return bytes;
    }
}
