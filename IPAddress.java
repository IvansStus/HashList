package dns_resolver;

/**
 * The IPAddress is using iIPv4 and has dotted-decimal notation, with the network, two subnets, 
 * and host separated by periods. For example, the IP address 130.191.226.146 has 
 * a network of 130, a subnet of 191, the second subnet is 226, and the host address is 146.
 * 
 * Your IPAddress class should accept a string of dotted-decimal IPAddresses in the constructor
 * and separate them into the components. 
 *
 * Note: The templates for some methods have been provided, but you should consider which additional
 * methods to add to this class.
 * 
 * @see <a href="https://en.wikipedia.org/wiki/IP_address#IPv4_addresses">Wikipedia IPv4 addresses</a>
 * @author CS310
 *
 */

public class IPAddress implements Comparable<IPAddress> {

	int network;
	int subnet;
	int subnet2;
	int host;

	/**
	 * The constructor for the IPAddress class
	 * 
	 * @param ip the dotted-decimal IP address
	 */
	public IPAddress(String ip) {
		
	}


	@Override
	public int hashCode() {
		//TODO write this method!
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		//TODO write this method!
		return false;
	}

	@Override
	public String toString() {
		//TODO write this method!
		return null;
	}

	@Override
	public int compareTo(IPAddress ip) {
		// TODO write this method!
		return 0;
	}

}
