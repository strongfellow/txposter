
import org.bitcoinj.core.NetworkParameters
import org.bitcoinj.params.MainNetParams
import org.bitcoinj.core.PeerGroup 


object Main {
  def main(args: Array[String]) {
    println("Hello, world!")
    val params:NetworkParameters = MainNetParams.get();

    val peerGroup: PeerGroup = new PeerGroup(params);
    peerGroup.setUseLocalhostPeerWhenPossible(true);
    val localhost = peerGroup.connectToLocalHost();
    peerGroup.start();
    println("Goodbye, world!")
  }
}
