package exception.ex3;

import exception.ex3.exception.ConnectionExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    // 연결 성공
    public void connect() throws ConnectionExceptionV3 {
        if (connectError) {
            throw new ConnectionExceptionV3(
                address,
                address + " 서버 연결 실패"
            );
        }

        System.out.println(address + " 서버 연결 성공");
    }

    // 전송 성공
    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(
                data,
                address + " 서버에 데이터 전송 실패 : " + data
            );
        }

        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    // 접속 종료
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }

        if(data.contains("error2")) {
            sendError = true;
        }
    }
}
