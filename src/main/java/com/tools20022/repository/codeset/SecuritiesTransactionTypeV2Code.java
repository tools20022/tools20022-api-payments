/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Transaction is a pre-advice, that is, for matching purposes only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#BuySellBack
 * SecuritiesTransactionTypeV2Code.mmBuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#BuyIn
 * SecuritiesTransactionTypeV2Code.mmBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#CentralBankCollateralOperation
 * SecuritiesTransactionTypeV2Code.mmCentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#CollateralIn
 * SecuritiesTransactionTypeV2Code.mmCollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#CollateralOut
 * SecuritiesTransactionTypeV2Code.mmCollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#DepositoryReceiptConversion
 * SecuritiesTransactionTypeV2Code.mmDepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#FactorUpdate
 * SecuritiesTransactionTypeV2Code.mmFactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#MoveOfStock
 * SecuritiesTransactionTypeV2Code.mmMoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Issuance
 * SecuritiesTransactionTypeV2Code.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#MarkDown
 * SecuritiesTransactionTypeV2Code.mmMarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#MarkUp
 * SecuritiesTransactionTypeV2Code.mmMarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Netting
 * SecuritiesTransactionTypeV2Code.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#NonSyndicated
 * SecuritiesTransactionTypeV2Code.mmNonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#ExternalAccountTransfer
 * SecuritiesTransactionTypeV2Code.mmExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#InternalAccountTransfer
 * SecuritiesTransactionTypeV2Code.mmInternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#PairOff
 * SecuritiesTransactionTypeV2Code.mmPairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Placement
 * SecuritiesTransactionTypeV2Code.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#PortfolioMove
 * SecuritiesTransactionTypeV2Code.mmPortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Realignment
 * SecuritiesTransactionTypeV2Code.mmRealignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Withdrawal
 * SecuritiesTransactionTypeV2Code.mmWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Redemption
 * SecuritiesTransactionTypeV2Code.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#DepositoryReceiptReleaseCancellation
 * SecuritiesTransactionTypeV2Code.mmDepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Repo
 * SecuritiesTransactionTypeV2Code.mmRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#ReturnDeliveryWithoutMatching
 * SecuritiesTransactionTypeV2Code.mmReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Reporting
 * SecuritiesTransactionTypeV2Code.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#ReverseRepo
 * SecuritiesTransactionTypeV2Code.mmReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#SellBuyBack
 * SecuritiesTransactionTypeV2Code.mmSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#BorrowingReallocation
 * SecuritiesTransactionTypeV2Code.mmBorrowingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#SecuritiesBorrowing
 * SecuritiesTransactionTypeV2Code.mmSecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#SecuritiesLending
 * SecuritiesTransactionTypeV2Code.mmSecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#LendingReallocation
 * SecuritiesTransactionTypeV2Code.mmLendingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Subscription
 * SecuritiesTransactionTypeV2Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#SyndicateUnderwriters
 * SecuritiesTransactionTypeV2Code.mmSyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#TBAClosing
 * SecuritiesTransactionTypeV2Code.mmTBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Trade
 * SecuritiesTransactionTypeV2Code.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#TripartyRepo
 * SecuritiesTransactionTypeV2Code.mmTripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#TripartyReverseRepo
 * SecuritiesTransactionTypeV2Code.mmTripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#Turnaround
 * SecuritiesTransactionTypeV2Code.mmTurnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#PreAdvice
 * SecuritiesTransactionTypeV2Code.mmPreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#AutoCollateralisation
 * SecuritiesTransactionTypeV2Code.mmAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#MarketClaim
 * SecuritiesTransactionTypeV2Code.mmMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#CorporateAction
 * SecuritiesTransactionTypeV2Code.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code#ExchangeTradedFunds
 * SecuritiesTransactionTypeV2Code.mmExchangeTradedFunds}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BSBK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction is a pre-advice, that is, for matching purposes only."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to a buy sell back transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a buy sell back transaction."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code BuySellBack = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySellBack";
			definition = "Relates to a buy sell back transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "BSBK";
		}
	};
	/**
	 * Transaction relates to a buy-in by the market following a delivery
	 * transaction failure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction relates to a buy-in by the market following a delivery transaction failure."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code BuyIn = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyIn";
			definition = "Transaction relates to a buy-in by the market following a delivery transaction failure.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "BIYI";
		}
	};
	/**
	 * Relates to a collateral delivery/receipt to a national central bank for
	 * central bank credit operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankCollateralOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code CentralBankCollateralOperation = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralBankCollateralOperation";
			definition = "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CNCB";
		}
	};
	/**
	 * Relates to a collateral transaction, from the point of view of the
	 * collateral taker or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a collateral transaction, from the point of view of the collateral taker or its agent."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code CollateralIn = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralIn";
			definition = "Relates to a collateral transaction, from the point of view of the collateral taker or its agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Relates to a collateral transaction, from the point of view of the
	 * collateral giver or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a collateral transaction, from the point of view of the collateral giver or its agent."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code CollateralOut = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralOut";
			definition = "Relates to a collateral transaction, from the point of view of the collateral giver or its agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Relates to a depository receipt conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a depository receipt conversion."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code DepositoryReceiptConversion = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptConversion";
			definition = "Relates to a depository receipt conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Relates to a factor update.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a factor update."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code FactorUpdate = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FactorUpdate";
			definition = "Relates to a factor update.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "FCTA";
		}
	};
	/**
	 * Relates to a movement of shares into or out of a pooled account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveOfStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a movement of shares into or out of a pooled account."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code MoveOfStock = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoveOfStock";
			definition = "Relates to a movement of shares into or out of a pooled account.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Relates to the issuance of a security such as an equity or a depositary
	 * receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issuance of a security such as an equity or a depositary receipt."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Issuance = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Relates to the issuance of a security such as an equity or a depositary receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Relates to the decrease of positions held by an International Central
	 * Securities Depository (ICSD) at the common depository due to custody
	 * operations (repurchase, pre-release, proceed of corp. event realigned).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code MarkDown = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkDown";
			definition = "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "MKDW";
		}
	};
	/**
	 * Relates to the increase of positions held by an International Central
	 * Securities Depository (ICSD) at the common depository due to custody
	 * operations (repurchase, pre-release, proceed of corporate event
	 * realigned).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code MarkUp = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkUp";
			definition = "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "MKUP";
		}
	};
	/**
	 * Relates to the netting of settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to the netting of settlement instructions."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Netting = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Relates to the issue of medium and short term paper (CP, CD, MTN, notes
	 * ...) under a program and without syndication arrangement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSYN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issue of medium and short term paper (CP, CD, MTN, notes ...) under a program and without syndication arrangement."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code NonSyndicated = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonSyndicated";
			definition = "Relates to the issue of medium and short term paper (CP, CD, MTN, notes ...) under a program and without syndication arrangement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "NSYN";
		}
	};
	/**
	 * Relates to an account transfer involving more than one instructing party
	 * (messages sender) and/or account servicer (messages receiver).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code ExternalAccountTransfer = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExternalAccountTransfer";
			definition = "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "OWNE";
		}
	};
	/**
	 * Relates to an account transfer involving one instructing party (messages
	 * sender) at one account servicer (messages receiver).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code InternalAccountTransfer = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InternalAccountTransfer";
			definition = "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "OWNI";
		}
	};
	/**
	 * Relates to a pair-off: the transaction is paired off and netted against
	 * one or more previous transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code PairOff = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Relates to the placement/new issue of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the placement/new issue of a financial instrument."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Placement = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Placement";
			definition = "Relates to the placement/new issue of a financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Relates to a portfolio move from one investment manager to another and/or
	 * from an account servicer to another. It is generally charged differently
	 * than another account transfer, hence the need to identify this type of
	 * transfer as such.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code PortfolioMove = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PortfolioMove";
			definition = "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PORT";
		}
	};
	/**
	 * Relates to a realignment of positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a realignment of positions."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Realignment = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Realignment";
			definition = "Relates to a realignment of positions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REAL";
		}
	};
	/**
	 * Relates to the withdrawal of specified amounts from specified
	 * subaccounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the withdrawal of specified amounts from specified subaccounts."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Withdrawal = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withdrawal";
			definition = "Relates to the withdrawal of specified amounts from specified subaccounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REDI";
		}
	};
	/**
	 * Relates to a redemption of funds (funds industry only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a redemption of funds (funds industry only)."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Redemption = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Redemption";
			definition = "Relates to a redemption of funds (funds industry only).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Relates to a release (into/from local) of depository receipt operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RELE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptReleaseCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a release (into/from local) of depository receipt operation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code DepositoryReceiptReleaseCancellation = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			definition = "Relates to a release (into/from local) of depository receipt operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RELE";
		}
	};
	/**
	 * Relates to a repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a repurchase agreement transaction."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Repo = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Repo";
			definition = "Relates to a repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REPU";
		}
	};
	/**
	 * Relates to the return of financial instruments resulting from a rejected
	 * delivery without matching operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnDeliveryWithoutMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the return of financial instruments resulting from a rejected delivery without matching operation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code ReturnDeliveryWithoutMatching = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RODE";
		}
	};
	/**
	 * Relates to a transaction that is for reporting purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a transaction that is for reporting purposes only."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Reporting = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RPTO";
		}
	};
	/**
	 * Relates to a reverse repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a reverse repurchase agreement transaction."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code ReverseRepo = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseRepo";
			definition = "Relates to a reverse repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RVPO";
		}
	};
	/**
	 * Relates to a sell buy back transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a sell buy back transaction."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code SellBuyBack = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellBuyBack";
			definition = "Relates to a sell buy back transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SBBK";
		}
	};
	/**
	 * Internal reallocation of a borrowed holding from one safekeeping account
	 * to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingReallocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal reallocation of a borrowed holding from one safekeeping account to another."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code BorrowingReallocation = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorrowingReallocation";
			definition = "Internal reallocation of a borrowed holding from one safekeeping account to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SBRE";
		}
	};
	/**
	 * Relates to a securities borrowing operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a securities borrowing operation."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code SecuritiesBorrowing = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBorrowing";
			definition = "Relates to a securities borrowing operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SECB";
		}
	};
	/**
	 * Relates to a securities lending operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a securities lending operation."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code SecuritiesLending = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Relates to a securities lending operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SECL";
		}
	};
	/**
	 * Internal reallocation of a holding on loan from one safekeeping account
	 * to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingReallocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal reallocation of a holding on loan from one safekeeping account to another."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code LendingReallocation = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LendingReallocation";
			definition = "Internal reallocation of a holding on loan from one safekeeping account to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SLRE";
		}
	};
	/**
	 * Relates to a subscription to funds (funds industry only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a subscription to funds (funds industry only)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Subscription = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Relates to a subscription to funds (funds industry only).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Relates to the issue of financial instruments through a syndicate of
	 * underwriters and a lead manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code SyndicateUnderwriters = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SyndicateUnderwriters";
			definition = "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SYND";
		}
	};
	/**
	 * Relates to a To Be Announced (TBA) closing trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a To Be Announced (TBA) closing trade."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code TBAClosing = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TBAClosing";
			definition = "Relates to a To Be Announced (TBA) closing trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TBAC";
		}
	};
	/**
	 * Relates to the settlement of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to the settlement of a trade."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Trade = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Relates to the settlement of a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Relates to a triparty repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a triparty repurchase agreement."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code TripartyRepo = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyRepo";
			definition = "Relates to a triparty repurchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TRPO";
		}
	};
	/**
	 * Relates to a triparty reverse repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a triparty reverse repurchase agreement."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code TripartyReverseRepo = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyReverseRepo";
			definition = "Relates to a triparty reverse repurchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TRVO";
		}
	};
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TURN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code Turnaround = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Turnaround";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TURN";
		}
	};
	/**
	 * Transaction is a pre-advice, that is, for matching purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a pre-advice, that is, for matching purposes only."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code PreAdvice = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Relates to an auto-collateralisation movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to an auto-collateralisation movement."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code AutoCollateralisation = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoCollateralisation";
			definition = "Relates to an auto-collateralisation movement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Relates to a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a market claim."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code MarketClaim = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Relates to a market claim.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CLAI";
		}
	};
	/**
	 * Relates to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a corporate action."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code CorporateAction = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Relates to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Relates to an ETF creation or redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to an ETF creation or redemption."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV2Code ExchangeTradedFunds = new SecuritiesTransactionTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			definition = "Relates to an ETF creation or redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "ETFT";
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionTypeV2Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BSBK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionTypeV2Code";
				definition = "Transaction is a pre-advice, that is, for matching purposes only.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.BuySellBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.BuyIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.DepositoryReceiptConversion,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.FactorUpdate, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MoveOfStock,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Issuance, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MarkDown,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MarkUp, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Netting,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.NonSyndicated, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ExternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.InternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.PairOff,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Placement, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.PortfolioMove,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Realignment, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Withdrawal,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Redemption, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.DepositoryReceiptReleaseCancellation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Repo, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ReturnDeliveryWithoutMatching,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Reporting, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SellBuyBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.BorrowingReallocation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.LendingReallocation, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Subscription,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SyndicateUnderwriters, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.TBAClosing,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Trade, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.TripartyRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.TripartyReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Turnaround,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.PreAdvice, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.AutoCollateralisation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MarketClaim, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CorporateAction,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ExchangeTradedFunds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuySellBack.getCodeName().get(), BuySellBack);
		codesByName.put(BuyIn.getCodeName().get(), BuyIn);
		codesByName.put(CentralBankCollateralOperation.getCodeName().get(), CentralBankCollateralOperation);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(DepositoryReceiptConversion.getCodeName().get(), DepositoryReceiptConversion);
		codesByName.put(FactorUpdate.getCodeName().get(), FactorUpdate);
		codesByName.put(MoveOfStock.getCodeName().get(), MoveOfStock);
		codesByName.put(Issuance.getCodeName().get(), Issuance);
		codesByName.put(MarkDown.getCodeName().get(), MarkDown);
		codesByName.put(MarkUp.getCodeName().get(), MarkUp);
		codesByName.put(Netting.getCodeName().get(), Netting);
		codesByName.put(NonSyndicated.getCodeName().get(), NonSyndicated);
		codesByName.put(ExternalAccountTransfer.getCodeName().get(), ExternalAccountTransfer);
		codesByName.put(InternalAccountTransfer.getCodeName().get(), InternalAccountTransfer);
		codesByName.put(PairOff.getCodeName().get(), PairOff);
		codesByName.put(Placement.getCodeName().get(), Placement);
		codesByName.put(PortfolioMove.getCodeName().get(), PortfolioMove);
		codesByName.put(Realignment.getCodeName().get(), Realignment);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(DepositoryReceiptReleaseCancellation.getCodeName().get(), DepositoryReceiptReleaseCancellation);
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(ReturnDeliveryWithoutMatching.getCodeName().get(), ReturnDeliveryWithoutMatching);
		codesByName.put(Reporting.getCodeName().get(), Reporting);
		codesByName.put(ReverseRepo.getCodeName().get(), ReverseRepo);
		codesByName.put(SellBuyBack.getCodeName().get(), SellBuyBack);
		codesByName.put(BorrowingReallocation.getCodeName().get(), BorrowingReallocation);
		codesByName.put(SecuritiesBorrowing.getCodeName().get(), SecuritiesBorrowing);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(LendingReallocation.getCodeName().get(), LendingReallocation);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SyndicateUnderwriters.getCodeName().get(), SyndicateUnderwriters);
		codesByName.put(TBAClosing.getCodeName().get(), TBAClosing);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(TripartyRepo.getCodeName().get(), TripartyRepo);
		codesByName.put(TripartyReverseRepo.getCodeName().get(), TripartyReverseRepo);
		codesByName.put(Turnaround.getCodeName().get(), Turnaround);
		codesByName.put(PreAdvice.getCodeName().get(), PreAdvice);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
	}

	public static SecuritiesTransactionTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionTypeV2Code[] values() {
		SecuritiesTransactionTypeV2Code[] values = new SecuritiesTransactionTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionTypeV2Code> {
		@Override
		public SecuritiesTransactionTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}