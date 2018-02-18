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
import com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the securities or investment fund balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#AvailableWithNoAdditionalStatus
 * SecuritiesBalanceTypeV2Code.AvailableWithNoAdditionalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Blocked
 * SecuritiesBalanceTypeV2Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Available
 * SecuritiesBalanceTypeV2Code.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#BlockedCorporateAction
 * SecuritiesBalanceTypeV2Code.BlockedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#BlockedTrading
 * SecuritiesBalanceTypeV2Code.BlockedTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#BlockedAuthenticity
 * SecuritiesBalanceTypeV2Code.BlockedAuthenticity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Borrowed
 * SecuritiesBalanceTypeV2Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingBorrowedDelivery
 * SecuritiesBalanceTypeV2Code.PendingBorrowedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingBorrowedReceipt
 * SecuritiesBalanceTypeV2Code.PendingBorrowedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#CollateralIn
 * SecuritiesBalanceTypeV2Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#CollateralOut
 * SecuritiesBalanceTypeV2Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#EligibleForCollateralPurposes
 * SecuritiesBalanceTypeV2Code.EligibleForCollateralPurposes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#OnLoan
 * SecuritiesBalanceTypeV2Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingOnLoanDelivery
 * SecuritiesBalanceTypeV2Code.PendingOnLoanDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingOnLoanReceipt
 * SecuritiesBalanceTypeV2Code.PendingOnLoanReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#DerivativesMargin
 * SecuritiesBalanceTypeV2Code.DerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingDeliveryMatchedBalance
 * SecuritiesBalanceTypeV2Code.PendingDeliveryMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingDeliveryUnmatchedBalance
 * SecuritiesBalanceTypeV2Code.PendingDeliveryUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingReceiptMatchedBalance
 * SecuritiesBalanceTypeV2Code.PendingReceiptMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingReceiptUnmatchedBalance
 * SecuritiesBalanceTypeV2Code.PendingReceiptUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingCorporateActionReceipt
 * SecuritiesBalanceTypeV2Code.PendingCorporateActionReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingCorporateActionDelivery
 * SecuritiesBalanceTypeV2Code.PendingCorporateActionDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingDelivery
 * SecuritiesBalanceTypeV2Code.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#PendingReceipt
 * SecuritiesBalanceTypeV2Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Pledged
 * SecuritiesBalanceTypeV2Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#OutForRegistration
 * SecuritiesBalanceTypeV2Code.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Restricted
 * SecuritiesBalanceTypeV2Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Unclassified
 * SecuritiesBalanceTypeV2Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#InTransshipment
 * SecuritiesBalanceTypeV2Code.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Drawn
 * SecuritiesBalanceTypeV2Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#TaxExempt
 * SecuritiesBalanceTypeV2Code.TaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#NonTaxExempt
 * SecuritiesBalanceTypeV2Code.NonTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Registered
 * SecuritiesBalanceTypeV2Code.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#StreetPosition
 * SecuritiesBalanceTypeV2Code.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Unregistered
 * SecuritiesBalanceTypeV2Code.Unregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#WaitingDocumentation
 * SecuritiesBalanceTypeV2Code.WaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#BeingTransferred
 * SecuritiesBalanceTypeV2Code.BeingTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#Issued
 * SecuritiesBalanceTypeV2Code.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code#QuasiIssued
 * SecuritiesBalanceTypeV2Code.QuasiIssued}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AWAS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance of financial instruments that are freely available with no
	 * specific additional status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoAdditionalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are freely available with no specific additional status."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code AvailableWithNoAdditionalStatus = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			definition = "Balance of financial instruments that are freely available with no specific additional status.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "AWAS";
		}
	};
	/**
	 * Balance of financial instruments that are blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are blocked."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Blocked = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Balance of financial instruments that are blocked.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLOK";
		}
	};
	/**
	 * Balance of financial instruments that are available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are available."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Available = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			definition = "Balance of financial instruments that are available.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "AVAI";
		}
	};
	/**
	 * Balance of financial instrument blocked following a corporate action,
	 * including proxy activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instrument blocked following a corporate action, including proxy activities."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code BlockedCorporateAction = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedCorporateAction";
			definition = "Balance of financial instrument blocked following a corporate action, including proxy activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLCA";
		}
	};
	/**
	 * Balance of financial instruments that are blocked for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are blocked for trading."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code BlockedTrading = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrading";
			definition = "Balance of financial instruments that are blocked for trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLOT";
		}
	};
	/**
	 * Balance of financial instruments that are blocked for verification of
	 * authenticity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAuthenticity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are blocked for verification of authenticity."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code BlockedAuthenticity = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAuthenticity";
			definition = "Balance of financial instruments that are blocked for verification of authenticity.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLOV";
		}
	};
	/**
	 * Balance of financial instruments that have been borrowed from another
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been borrowed from another party."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Borrowed = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Balance of financial instruments that are pending delivery in relation to
	 * a borrow transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery in relation to a borrow transaction."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingBorrowedDelivery = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a borrow transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BODE";
		}
	};
	/**
	 * Balance of financial instruments that are pending receipt in relation to
	 * a borrow transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt in relation to a borrow transaction."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingBorrowedReceipt = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a borrow transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BORE";
		}
	};
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code CollateralIn = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Balance of securities that belong to the safekeeping account indicated
	 * within this message, and are deposited with a third party for the purpose
	 * of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code CollateralOut = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Balance of securities that are eligible for use for collateral purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateralPurposes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are eligible for use for collateral purposes."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code EligibleForCollateralPurposes = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposes";
			definition = "Balance of securities that are eligible for use for collateral purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "COLA";
		}
	};
	/**
	 * Loan for consumption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan for consumption."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code OnLoan = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			definition = "Loan for consumption.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Balance of financial instruments that are pending delivery in relation to
	 * a lending transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery in relation to a lending transaction."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingOnLoanDelivery = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a lending transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "LODE";
		}
	};
	/**
	 * Balance of financial instruments that are pending receipt in relation to
	 * a lending transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt in relation to a lending transaction."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingOnLoanReceipt = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a lending transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "LORE";
		}
	};
	/**
	 * Account is used when financing is by the broker/dealer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativesMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used when financing is by the broker/dealer."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code DerivativesMargin = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			definition = "Account is used when financing is by the broker/dealer.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Balance of financial instruments pending delivery that have been matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryMatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending delivery that have been matched."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingDeliveryMatchedBalance = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryMatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PDMT";
		}
	};
	/**
	 * Balance of financial instruments pending delivery that have been
	 * unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryUnmatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending delivery that have been unmatched."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingDeliveryUnmatchedBalance = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryUnmatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been unmatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PDUM";
		}
	};
	/**
	 * Balance of financial instruments pending receipt that have been matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptMatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending receipt that have been matched."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingReceiptMatchedBalance = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptMatchedBalance";
			definition = "Balance of financial instruments pending receipt that have been matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PRMT";
		}
	};
	/**
	 * Balance of financial instruments pending receipt that are unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptUnmatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending receipt that are unmatched."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingReceiptUnmatchedBalance = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptUnmatchedBalance";
			definition = "Balance of financial instruments pending receipt that are unmatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PRUM";
		}
	};
	/**
	 * Balance of financial instrument pending receipt following a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PECA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instrument pending receipt following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingCorporateActionReceipt = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionReceipt";
			definition = "Balance of financial instrument pending receipt following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PECA";
		}
	};
	/**
	 * Balance of financial instrument pending delivery following a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instrument pending delivery following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingCorporateActionDelivery = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionDelivery";
			definition = "Balance of financial instrument pending delivery following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PEDA";
		}
	};
	/**
	 * Processing has not been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing has not been completed."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingDelivery = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			definition = "Processing has not been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * The instruction is pending receipt of securities, for example, from a
	 * purchase, loan etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The instruction is pending receipt of securities, for example, from a purchase, loan etc."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code PendingReceipt = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			definition = "The instruction is pending receipt of securities, for example, from a purchase, loan etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Balance of securities that belong to and is kept in the safekeeping
	 * account indicated within this message, and that are pledged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Pledged = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PLED";
		}
	};
	/**
	 * Balance of financial instruments currently being processed by the
	 * institution responsible for registering the new beneficial owner (or
	 * nominee).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code OutForRegistration = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "REGO";
		}
	};
	/**
	 * Balance of financial instruments that may only be sold under certain
	 * conditions or require legal documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that may only be sold under certain conditions or require legal documents."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Restricted = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			definition = "Balance of financial instruments that may only be sold under certain conditions or require legal documents.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "RSTR";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Unclassified = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction has been generated due to transformation following a
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated due to transformation following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code InTransshipment = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Settlement transactions relates to drawn securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transactions relates to drawn securities."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Drawn = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Tax-exempt financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax-exempt financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code TaxExempt = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Taxable financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxable financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code NonTaxExempt = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonTaxExempt";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Balance of financial instruments that are registered (in nominee name or
	 * in the name of the beneficial owner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Registered = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			definition = "Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Balance of financial instruments that remain registered in the name of
	 * the prior beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that remain registered in the name of the prior beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code StreetPosition = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "SPOS";
		}
	};
	/**
	 * Balance of securities that could not be registered due to foreign
	 * ownership limitation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unregistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that could not be registered due to foreign ownership limitation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Unregistered = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			definition = "Balance of securities that could not be registered due to foreign ownership limitation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "UNRG";
		}
	};
	/**
	 * Financial instrument is unavailable due to missing or incomplete
	 * documentation pertaining to the account, or due to a missing or
	 * incomplete order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code WaitingDocumentation = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			definition = "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "WDOC";
		}
	};
	/**
	 * Financial instrument is unavailable as a result of a transfer order,
	 * pending movement in the shareholders' register.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code BeingTransferred = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			definition = "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BTRA";
		}
	};
	/**
	 * In issuer agent / depository communication, balance of issued financial
	 * instruments for which legal documentation has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code Issued = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			definition = "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * In issuer agent / depository communication, balance of issued financial
	 * instruments for which legal documentation has not yet been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has not yet been received."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeV2Code QuasiIssued = new SecuritiesBalanceTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiIssued";
			definition = "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has not yet been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "QUAS";
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceTypeV2Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWAS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTypeV2Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.AvailableWithNoAdditionalStatus, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Blocked,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Available, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BlockedCorporateAction,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BlockedTrading, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BlockedAuthenticity,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Borrowed, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingBorrowedDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingBorrowedReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.EligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingOnLoanDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingOnLoanReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingDeliveryMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingDeliveryUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingReceiptMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingReceiptUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingCorporateActionReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingCorporateActionDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.OutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Restricted, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Unclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.InTransshipment, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Drawn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.TaxExempt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.NonTaxExempt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Registered, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.StreetPosition,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Unregistered, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.WaitingDocumentation,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BeingTransferred, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Issued,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.QuasiIssued);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AvailableWithNoAdditionalStatus.getCodeName().get(), AvailableWithNoAdditionalStatus);
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(Available.getCodeName().get(), Available);
		codesByName.put(BlockedCorporateAction.getCodeName().get(), BlockedCorporateAction);
		codesByName.put(BlockedTrading.getCodeName().get(), BlockedTrading);
		codesByName.put(BlockedAuthenticity.getCodeName().get(), BlockedAuthenticity);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(PendingBorrowedDelivery.getCodeName().get(), PendingBorrowedDelivery);
		codesByName.put(PendingBorrowedReceipt.getCodeName().get(), PendingBorrowedReceipt);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(EligibleForCollateralPurposes.getCodeName().get(), EligibleForCollateralPurposes);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(PendingOnLoanDelivery.getCodeName().get(), PendingOnLoanDelivery);
		codesByName.put(PendingOnLoanReceipt.getCodeName().get(), PendingOnLoanReceipt);
		codesByName.put(DerivativesMargin.getCodeName().get(), DerivativesMargin);
		codesByName.put(PendingDeliveryMatchedBalance.getCodeName().get(), PendingDeliveryMatchedBalance);
		codesByName.put(PendingDeliveryUnmatchedBalance.getCodeName().get(), PendingDeliveryUnmatchedBalance);
		codesByName.put(PendingReceiptMatchedBalance.getCodeName().get(), PendingReceiptMatchedBalance);
		codesByName.put(PendingReceiptUnmatchedBalance.getCodeName().get(), PendingReceiptUnmatchedBalance);
		codesByName.put(PendingCorporateActionReceipt.getCodeName().get(), PendingCorporateActionReceipt);
		codesByName.put(PendingCorporateActionDelivery.getCodeName().get(), PendingCorporateActionDelivery);
		codesByName.put(PendingDelivery.getCodeName().get(), PendingDelivery);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(InTransshipment.getCodeName().get(), InTransshipment);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(TaxExempt.getCodeName().get(), TaxExempt);
		codesByName.put(NonTaxExempt.getCodeName().get(), NonTaxExempt);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(StreetPosition.getCodeName().get(), StreetPosition);
		codesByName.put(Unregistered.getCodeName().get(), Unregistered);
		codesByName.put(WaitingDocumentation.getCodeName().get(), WaitingDocumentation);
		codesByName.put(BeingTransferred.getCodeName().get(), BeingTransferred);
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(QuasiIssued.getCodeName().get(), QuasiIssued);
	}

	public static SecuritiesBalanceTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceTypeV2Code[] values() {
		SecuritiesBalanceTypeV2Code[] values = new SecuritiesBalanceTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceTypeV2Code> {
		@Override
		public SecuritiesBalanceTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}