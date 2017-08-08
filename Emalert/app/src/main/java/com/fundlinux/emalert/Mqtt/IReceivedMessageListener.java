package com.fundlinux.emalert.Mqtt;

/**
 * Created by parivera on 08/08/2017.
 */

public interface IReceivedMessageListener {
    void onMessageReceived(ReceivedMessage message);
}
