package protocolsupport.protocol.packet.middleimpl.writeable.login.v_pe;

import io.netty.buffer.ByteBuf;
import net.md_5.bungee.protocol.packet.LoginSuccess;
import protocolsupport.protocol.packet.id.PEPacketId;
import protocolsupport.protocol.packet.middleimpl.writeable.PESingleWriteablePacket;

public class LoginSuccessPacket extends PESingleWriteablePacket<LoginSuccess> {

	public LoginSuccessPacket() {
		super(PEPacketId.Clientbound.PLAY_PLAY_STATUS);
	}

	@Override
	protected void write(ByteBuf data, LoginSuccess packet) {
		data.writeInt(0);
	}

}
