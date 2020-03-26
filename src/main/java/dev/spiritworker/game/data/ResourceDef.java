package dev.spiritworker.game.data;

import java.util.List;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;

public abstract class ResourceDef implements Comparable<ResourceDef>{

	private final int id;

	public int getId() { return id; }

	public ResourceDef(int id) { this.id = id; }

	// Load function
	public abstract void loadFromRes(ByteBuffer buf);
	public void loadScriptFromRes(ByteBuffer buf)   {}
	public void loadFromTranslate(List<String> obj) {}

	public List<byte[]> writeRes() {
		return new ArrayList<>();
	}

	public long sum() { return 0; }

	// Helpers
	public String readString(ByteBuffer buf) {
		int len = (buf.getShort()) & 0xFFFF;
		StringBuffer sb = new StringBuffer(len);
		int i;
		for (int j = 0; j < len; j++) {
			i = (buf.getShort()) & 0xFFFF;
			if (i == 0) { // End of string
				break;
			} else {
				sb.append((char) i);
			}
		}
		return sb.toString();
	}

	// Helpers to write
	public ByteBuffer writeStringByte(String string) {
		int len = string.length();

		ByteBuffer buf = ByteBuffer.allocate((len * 2) + 2);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putShort(Integer.valueOf(len).shortValue());

		StringBuilder sb = new StringBuilder(string);
		for (int j=0; j < len; j++) {
			buf.putShort((short) sb.charAt(j));
		}

		return buf;
	}
	public ByteBuffer writeIntByte(int integer) {
		ByteBuffer buf = ByteBuffer.allocate(4);
		buf.order(ByteOrder.LITTLE_ENDIAN);
		buf.putInt(integer);
		return buf;
	}
	public ByteBuffer writeShortByte(short sh) {
		ByteBuffer buf = ByteBuffer.allocate(2);
		buf.order(ByteOrder.LITTLE_ENDIAN);
		buf.putShort(sh);
		return buf;
	}
	public ByteBuffer writeByte(byte by) {
		ByteBuffer buf = ByteBuffer.allocate(1);
		buf.order(ByteOrder.LITTLE_ENDIAN);
		buf.put(by);
		return buf;
	}

	//Helper for checksum
	public long sumNumber(int num) { return (long) num; }
	public long sumString(String str) {
		long sum = 0;
		sum += (long) str.length();

		for (byte b : str.getBytes(StandardCharsets.UTF_16LE)) {
			if (b < 0) {
				sum += Byte.toUnsignedLong(b);
			} else {
				sum += (long) b;
			}
		}

		return sum;
	}

	@Override
	public int compareTo(ResourceDef def) {
		return this.getId() - def.getId();
	}
}