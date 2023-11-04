package com.java.networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Networking {
    public static void main(String[] args) throws UnknownHostException {

        String url = "phoenix-play.vercel.app";

        InetAddress inetAddress = Inet4Address.getByName(url);
        System.out.println("Address :: "+ Arrays.toString(inetAddress.getAddress()));
        System.out.println("Host address :: "+ inetAddress.getHostAddress());

        System.out.println("Canonical :: "+ inetAddress.getCanonicalHostName());
        System.out.println("Hash Code :: "+ inetAddress.hashCode());

        System.out.println("Is Link Local? :: "+ inetAddress.isLinkLocalAddress());
        System.out.println("Is Loop Back? :: "+ inetAddress.isLoopbackAddress());

        System.out.println("Is MC Link Local? :: "+ inetAddress.isMCLinkLocal());
        System.out.println("Is Multicast? :: "+ inetAddress.isMulticastAddress());

        // .... try all sorts of functionalities
    }
}

