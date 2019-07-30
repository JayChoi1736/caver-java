package com.klaytn.caver.generated;

import com.klaytn.caver.Caver;
import com.klaytn.caver.crypto.KlayCredentials;
import com.klaytn.caver.methods.response.KlayTransactionReceipt;
import com.klaytn.caver.tx.SmartContract;
import com.klaytn.caver.tx.manager.TransactionManager;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated smart contract code.
 * <p><strong>Do not modify!</strong>
 */
public class PullPaymentMock extends SmartContract {
    private static final String BINARY = "608060405260405161001090610052565b604051809103906000f08015801561002c573d6000803e3d6000fd5b50600080546001600160a01b0319166001600160a01b039290921691909117905561005f565b61054c806102d383390190565b6102658061006e6000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806331b3eb9414610046578063d44409911461006e578063e2982c211461009a575b600080fd5b61006c6004803603602081101561005c57600080fd5b50356001600160a01b03166100d2565b005b61006c6004803603604081101561008457600080fd5b506001600160a01b038135169060200135610138565b6100c0600480360360208110156100b057600080fd5b50356001600160a01b0316610146565b60408051918252519081900360200190f35b60008054604080516351cff8d960e01b81526001600160a01b038581166004830152915191909216926351cff8d9926024808201939182900301818387803b15801561011d57600080fd5b505af1158015610131573d6000803e3d6000fd5b5050505050565b61014282826101c6565b5050565b60008054604080516371d4ed8d60e11b81526001600160a01b0385811660048301529151919092169163e3a9db1a916024808301926020929190829003018186803b15801561019457600080fd5b505afa1580156101a8573d6000803e3d6000fd5b505050506040513d60208110156101be57600080fd5b505192915050565b600080546040805163f340fa0160e01b81526001600160a01b0386811660048301529151919092169263f340fa019285926024808301939282900301818588803b15801561021357600080fd5b505af1158015610227573d6000803e3d6000fd5b5050505050505056fea265627a7a72305820444c22f434ef6c9143b8611226ac8370d621b0e3e188d9272d23b131e7c2e92164736f6c6343000509003260806040819052600080546001600160a01b0319163317908190556001600160a01b031681527f4101e71e974f68df5e9730cc223280b41654676bbb052cdcc735c3337e64d2d990602090a16104f28061005a6000396000f3fe60806040526004361061004a5760003560e01c80632348238c1461004f57806351cff8d914610084578063c6dbdf61146100b7578063e3a9db1a146100e8578063f340fa011461012d575b600080fd5b34801561005b57600080fd5b506100826004803603602081101561007257600080fd5b50356001600160a01b0316610153565b005b34801561009057600080fd5b50610082600480360360208110156100a757600080fd5b50356001600160a01b031661023b565b3480156100c357600080fd5b506100cc610312565b604080516001600160a01b039092168252519081900360200190f35b3480156100f457600080fd5b5061011b6004803603602081101561010b57600080fd5b50356001600160a01b0316610321565b60408051918252519081900360200190f35b6100826004803603602081101561014357600080fd5b50356001600160a01b031661033c565b6000546001600160a01b0316331461019c5760405162461bcd60e51b815260040180806020018281038252602c815260200180610492602c913960400191505060405180910390fd5b6001600160a01b0381166101e15760405162461bcd60e51b815260040180806020018281038252602a815260200180610468602a913960400191505060405180910390fd5b600080546001600160a01b0319166001600160a01b03838116919091179182905560408051929091168252517f4101e71e974f68df5e9730cc223280b41654676bbb052cdcc735c3337e64d2d9916020908290030190a150565b6000546001600160a01b031633146102845760405162461bcd60e51b815260040180806020018281038252602c815260200180610492602c913960400191505060405180910390fd5b6001600160a01b038116600081815260016020526040808220805490839055905190929183156108fc02918491818181858888f193505050501580156102ce573d6000803e3d6000fd5b506040805182815290516001600160a01b038416917f7084f5476618d8e60b11ef0d7d3f06914655adb8793e28ff7f018d4c76d505d5919081900360200190a25050565b6000546001600160a01b031690565b6001600160a01b031660009081526001602052604090205490565b6000546001600160a01b031633146103855760405162461bcd60e51b815260040180806020018281038252602c815260200180610492602c913960400191505060405180910390fd5b6001600160a01b03811660009081526001602052604090205434906103b0908263ffffffff61040616565b6001600160a01b038316600081815260016020908152604091829020939093558051848152905191927f2da466a7b24304f47e87fa2e1e5a81b9831ce54fec19055ce277ca2f39ba42c492918290030190a25050565b600082820183811015610460576040805162461bcd60e51b815260206004820152601b60248201527f536166654d6174683a206164646974696f6e206f766572666c6f770000000000604482015290519081900360640190fd5b939250505056fe5365636f6e646172793a206e6577207072696d61727920697320746865207a65726f20616464726573735365636f6e646172793a2063616c6c6572206973206e6f7420746865207072696d617279206163636f756e74a265627a7a72305820f08e33e959fa9ed7ca9f81055912e31f22cdb77348370f8eb506e48e382a3e9d64736f6c63430005090032";

    public static final String FUNC_WITHDRAWPAYMENTS = "withdrawPayments";

    public static final String FUNC_CALLTRANSFER = "callTransfer";

    public static final String FUNC_PAYMENTS = "payments";

    protected PullPaymentMock(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    protected PullPaymentMock(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, caver, transactionManager, contractGasProvider);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> withdrawPayments(String payee) {
        final Function function = new Function(
                FUNC_WITHDRAWPAYMENTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(payee)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> callTransfer(String dest, BigInteger amount) {
        final Function function = new Function(
                FUNC_CALLTRANSFER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(dest), 
                new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> payments(String dest) {
        final Function function = new Function(FUNC_PAYMENTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(dest)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static PullPaymentMock load(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        return new PullPaymentMock(contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    public static PullPaymentMock load(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new PullPaymentMock(contractAddress, caver, transactionManager, contractGasProvider);
    }

    public static RemoteCall<PullPaymentMock> deploy(Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider, BigInteger initialPebValue) {
        return deployRemoteCall(PullPaymentMock.class, caver, credentials, chainId, contractGasProvider, BINARY, "", initialPebValue);
    }

    public static RemoteCall<PullPaymentMock> deploy(Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider, BigInteger initialPebValue) {
        return deployRemoteCall(PullPaymentMock.class, caver, transactionManager, contractGasProvider, BINARY, "", initialPebValue);
    }
}
