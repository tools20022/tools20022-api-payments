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
import com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a confirmation rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentInvestmentAccountDetails
 * RejectedConfirmationStatusReasonCode.DifferentInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentFinancialInstrumentDetails
 * RejectedConfirmationStatusReasonCode.DifferentFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentBeneficiaryDetails
 * RejectedConfirmationStatusReasonCode.DifferentBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentPlaceOfTrade
 * RejectedConfirmationStatusReasonCode.DifferentPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentOrderDateTime
 * RejectedConfirmationStatusReasonCode.DifferentOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentCancellationRight
 * RejectedConfirmationStatusReasonCode.DifferentCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentUnitsNumber
 * RejectedConfirmationStatusReasonCode.DifferentUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentOrderType
 * RejectedConfirmationStatusReasonCode.DifferentOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentRounding
 * RejectedConfirmationStatusReasonCode.DifferentRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentNetAmount
 * RejectedConfirmationStatusReasonCode.DifferentNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentGrossAmount
 * RejectedConfirmationStatusReasonCode.DifferentGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentHoldingsRedemptionRate
 * RejectedConfirmationStatusReasonCode.DifferentHoldingsRedemptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentGroup1Or2Units
 * RejectedConfirmationStatusReasonCode.DifferentGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentIncomePreference
 * RejectedConfirmationStatusReasonCode.DifferentIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentLetterIntentReference
 * RejectedConfirmationStatusReasonCode.DifferentLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentAccumulationRightReference
 * RejectedConfirmationStatusReasonCode.DifferentAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentPhysicalDeliveryIndicator
 * RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentRequestedSettlementCurrency
 * RejectedConfirmationStatusReasonCode.DifferentRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentRequestedNAVCurrency
 * RejectedConfirmationStatusReasonCode.DifferentRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentForeignExchangeDetails
 * RejectedConfirmationStatusReasonCode.DifferentForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentChargeDetails
 * RejectedConfirmationStatusReasonCode.DifferentChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentCommissionDetails
 * RejectedConfirmationStatusReasonCode.DifferentCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentTaxDetails
 * RejectedConfirmationStatusReasonCode.DifferentTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentPhysicalDeliveryDetails
 * RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentSettlementAndCustodyDetails
 * RejectedConfirmationStatusReasonCode.DifferentSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentPaymentInstrumentDetails
 * RejectedConfirmationStatusReasonCode.DifferentPaymentInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentSettlementAmount
 * RejectedConfirmationStatusReasonCode.DifferentSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentSettlementDate
 * RejectedConfirmationStatusReasonCode.DifferentSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentExtensionDetails
 * RejectedConfirmationStatusReasonCode.DifferentExtensionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentIntermediaryDetails
 * RejectedConfirmationStatusReasonCode.DifferentIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentTotalRedemptionAmount
 * RejectedConfirmationStatusReasonCode.DifferentTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentTotalSubscriptionAmount
 * RejectedConfirmationStatusReasonCode.DifferentTotalSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentAdditionalCashIn
 * RejectedConfirmationStatusReasonCode.DifferentAdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentResultingCashOut
 * RejectedConfirmationStatusReasonCode.DifferentResultingCashOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentPercentageOfTotalSubscriptionAmount
 * RejectedConfirmationStatusReasonCode.
 * DifferentPercentageOfTotalSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentPercentageOfTotalRedemptionAmount
 * RejectedConfirmationStatusReasonCode.
 * DifferentPercentageOfTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentLegIdentification
 * RejectedConfirmationStatusReasonCode.DifferentLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DifferentOrderReference
 * RejectedConfirmationStatusReasonCode.DifferentOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#UnknownLinkagesReference
 * RejectedConfirmationStatusReasonCode.UnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DuplicateDealReference
 * RejectedConfirmationStatusReasonCode.DuplicateDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#ReceivingAgent
 * RejectedConfirmationStatusReasonCode.ReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#ReceiversCustodian
 * RejectedConfirmationStatusReasonCode.ReceiversCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#ReceiversIntermediary
 * RejectedConfirmationStatusReasonCode.ReceiversIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DeliveringAgent
 * RejectedConfirmationStatusReasonCode.DeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DeliverersCustodian
 * RejectedConfirmationStatusReasonCode.DeliverersCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#DeliverersIntermediary
 * RejectedConfirmationStatusReasonCode.DeliverersIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#InvalidCreditTransfer
 * RejectedConfirmationStatusReasonCode.InvalidCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#SettlementAmount
 * RejectedConfirmationStatusReasonCode.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#SettlementDate
 * RejectedConfirmationStatusReasonCode.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#NotCompliantWithSLA
 * RejectedConfirmationStatusReasonCode.NotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#MissingEUTaxInformation
 * RejectedConfirmationStatusReasonCode.MissingEUTaxInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#MissingCommission
 * RejectedConfirmationStatusReasonCode.MissingCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#MissingCharge
 * RejectedConfirmationStatusReasonCode.MissingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#MissingTaxInformation
 * RejectedConfirmationStatusReasonCode.MissingTaxInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#NotAllowedtoAmend
 * RejectedConfirmationStatusReasonCode.NotAllowedtoAmend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode#AmendmentTooLate
 * RejectedConfirmationStatusReasonCode.AmendmentTooLate}</li>
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
 * <li>"DSAF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedConfirmationStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a confirmation rejected status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectedConfirmationStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment account information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentInvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentInvestmentAccountDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentInvestmentAccountDetails";
			definition = "Investment account information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSAF";
		}
	};
	/**
	 * Financial instrument information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentFinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentFinancialInstrumentDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentFinancialInstrumentDetails";
			definition = "Financial instrument information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DFIN";
		}
	};
	/**
	 * Beneficiary details is not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentBeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficiary details is not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentBeneficiaryDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentBeneficiaryDetails";
			definition = "Beneficiary details is not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DBEN";
		}
	};
	/**
	 * Place of trade not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of trade not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentPlaceOfTrade = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPlaceOfTrade";
			definition = "Place of trade not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPTD";
		}
	};
	/**
	 * Order date time not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DORD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentOrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order date time not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentOrderDateTime = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderDateTime";
			definition = "Order date time not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Cancellation right not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCXR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentCancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation right not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentCancellationRight = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCancellationRight";
			definition = "Cancellation right not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DCXR";
		}
	};
	/**
	 * Units number information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUNB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Units number information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentUnitsNumber = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentUnitsNumber";
			definition = "Units number information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DUNB";
		}
	};
	/**
	 * Order type information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentOrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order type information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentOrderType = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderType";
			definition = "Order type information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DORT";
		}
	};
	/**
	 * Rounding information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DROU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentRounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rounding information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentRounding = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRounding";
			definition = "Rounding information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DROU";
		}
	};
	/**
	 * Net amount information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net amount information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentNetAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentNetAmount";
			definition = "Net amount information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DNAM";
		}
	};
	/**
	 * Gross amount information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentGrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross amount information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentGrossAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGrossAmount";
			definition = "Gross amount information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DGAM";
		}
	};
	/**
	 * Holdings redemption rate not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DHRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentHoldingsRedemptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holdings redemption rate not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentHoldingsRedemptionRate = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentHoldingsRedemptionRate";
			definition = "Holdings redemption rate not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DHRR";
		}
	};
	/**
	 * Group 1 or 2 units not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentGroup1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Group 1 or 2 units not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentGroup1Or2Units = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGroup1Or2Units";
			definition = "Group 1 or 2 units not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DGRP";
		}
	};
	/**
	 * Income preference information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DINP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentIncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income preference information not the same as instructed."
	 * </li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentIncomePreference = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIncomePreference";
			definition = "Income preference information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DINP";
		}
	};
	/**
	 * Letter Intent reference information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentLetterIntentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Letter Intent reference information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentLetterIntentReference = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLetterIntentReference";
			definition = "Letter Intent reference information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DLIR";
		}
	};
	/**
	 * Accumulation right reference information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentAccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accumulation right reference information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentAccumulationRightReference = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAccumulationRightReference";
			definition = "Accumulation right reference information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DARR";
		}
	};
	/**
	 * Physical delivery indicator information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical delivery indicator information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentPhysicalDeliveryIndicator = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryIndicator";
			definition = "Physical delivery indicator information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPDI";
		}
	};
	/**
	 * Requested settlement currency information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentRequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested settlement currency information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentRequestedSettlementCurrency = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedSettlementCurrency";
			definition = "Requested settlement currency information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DRSC";
		}
	};
	/**
	 * Requested NAV currency information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentRequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested NAV currency information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentRequestedNAVCurrency = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedNAVCurrency";
			definition = "Requested NAV currency information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DNAV";
		}
	};
	/**
	 * Foreign exchange details information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign exchange details information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentForeignExchangeDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentForeignExchangeDetails";
			definition = "Foreign exchange details information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DFXD";
		}
	};
	/**
	 * Charge details information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge details information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentChargeDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentChargeDetails";
			definition = "Charge details information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DCHD";
		}
	};
	/**
	 * Commission details information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DXOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentCommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission details information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentCommissionDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCommissionDetails";
			definition = "Commission details information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DXOD";
		}
	};
	/**
	 * Tax details information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentTaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax details information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentTaxDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTaxDetails";
			definition = "Tax details information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DTAD";
		}
	};
	/**
	 * Physical delivery details information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical delivery details information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentPhysicalDeliveryDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryDetails";
			definition = "Physical delivery details information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPDD";
		}
	};
	/**
	 * Settlement and custody details information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentSettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement and custody details information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentSettlementAndCustodyDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAndCustodyDetails";
			definition = "Settlement and custody details information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSCA";
		}
	};
	/**
	 * Payment Instrument details information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPaymentInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment Instrument details information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentPaymentInstrumentDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPaymentInstrumentDetails";
			definition = "Payment Instrument details information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPID";
		}
	};
	/**
	 * Settlement amount not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement amount not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentSettlementAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAmount";
			definition = "Settlement amount not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSAM";
		}
	};
	/**
	 * Settlement date not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement date not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentSettlementDate = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementDate";
			definition = "Settlement date not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSDT";
		}
	};
	/**
	 * Extension information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentExtensionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Extension information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentExtensionDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentExtensionDetails";
			definition = "Extension information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DEXD";
		}
	};
	/**
	 * Intermediary information not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentIntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary information not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentIntermediaryDetails = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIntermediaryDetails";
			definition = "Intermediary information not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DIMD";
		}
	};
	/**
	 * Total redemption amount not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentTotalRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total redemption amount not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentTotalRedemptionAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalRedemptionAmount";
			definition = "Total redemption amount not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DTRA";
		}
	};
	/**
	 * Total subscription amount not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentTotalSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total subscription amount not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentTotalSubscriptionAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalSubscriptionAmount";
			definition = "Total subscription amount not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DTSA";
		}
	};
	/**
	 * Additional cash in not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DACI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentAdditionalCashIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional cash in not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentAdditionalCashIn = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAdditionalCashIn";
			definition = "Additional cash in not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DACI";
		}
	};
	/**
	 * Resulting cash out not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DACO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentResultingCashOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resulting cash out not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentResultingCashOut = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentResultingCashOut";
			definition = "Resulting cash out not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DACO";
		}
	};
	/**
	 * Percentage of total subscription amount not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPercentageOfTotalSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of total subscription amount not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentPercentageOfTotalSubscriptionAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalSubscriptionAmount";
			definition = "Percentage of total subscription amount not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPSA";
		}
	};
	/**
	 * Percentage of total redemption amount not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPercentageOfTotalRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of total redemption amount not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentPercentageOfTotalRedemptionAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalRedemptionAmount";
			definition = "Percentage of total redemption amount not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPRA";
		}
	};
	/**
	 * Leg Identification not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Leg Identification not the same as instructed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentLegIdentification = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLegIdentification";
			definition = "Leg Identification not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DLID";
		}
	};
	/**
	 * Confirmation is recognised by the Receiver because the message reference
	 * is identified, but the order reference is not the same as instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is recognised by the Receiver because the message reference is identified, but the order reference is not the same as instructed."
	 * </li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DifferentOrderReference = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderReference";
			definition = "Confirmation is recognised by the Receiver because the message reference is identified, but the order reference is not the same as instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DORF";
		}
	};
	/**
	 * Linked reference is not known.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ULNK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownLinkagesReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Linked reference is not known."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode UnknownLinkagesReference = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownLinkagesReference";
			definition = "Linked reference is not known.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Deal reference is a duplicate of a previously received deal reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateDealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deal reference is a duplicate of a previously received deal reference."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DuplicateDealReference = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateDealReference";
			definition = "Deal reference is a duplicate of a previously received deal reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DREF";
		}
	};
	/**
	 * Receiving agent is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IVAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiving agent is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode ReceivingAgent = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IVAG";
		}
	};
	/**
	 * Receiver's Custodian is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver's Custodian is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode ReceiversCustodian = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodian";
			definition = "Receiver's Custodian is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IRCU";
		}
	};
	/**
	 * Receiver's Intermediary is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver's Intermediary is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode ReceiversIntermediary = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary";
			definition = "Receiver's Intermediary is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IRIN";
		}
	};
	/**
	 * Delivering agent is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivering agent is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DeliveringAgent = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			definition = "Delivering agent is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Deliverer's Custodian is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deliverer's Custodian is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DeliverersCustodian = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodian";
			definition = "Deliverer's Custodian is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IDCU";
		}
	};
	/**
	 * Deliverer's Intermediary is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deliverer's Intermediary is not recognised or is invalid."
	 * </li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode DeliverersIntermediary = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary";
			definition = "Deliverer's Intermediary is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IDIN";
		}
	};
	/**
	 * Credit transfer details are incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit transfer details are incorrect."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode InvalidCreditTransfer = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCreditTransfer";
			definition = "Credit transfer details are incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ICTR";
		}
	};
	/**
	 * Settlement Amount is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement Amount is invalid."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode SettlementAmount = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Settlement Amount is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Settlement date or transfer date is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement date or transfer date is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode SettlementDate = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Settlement date or transfer date is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Confirmation is not compliant with the service level agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is not compliant with the service level agreement."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode NotCompliantWithSLA = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			definition = "Confirmation is not compliant with the service level agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "NSLA";
		}
	};
	/**
	 * EU tax information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingEUTaxInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "EU tax information is missing."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode MissingEUTaxInformation = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingEUTaxInformation";
			definition = "EU tax information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MEUT";
		}
	};
	/**
	 * Commission information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission information is missing."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode MissingCommission = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCommission";
			definition = "Commission information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MCOM";
		}
	};
	/**
	 * Charge information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge information is missing."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode MissingCharge = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCharge";
			definition = "Charge information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MCHA";
		}
	};
	/**
	 * Tax information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingTaxInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax information is missing."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode MissingTaxInformation = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingTaxInformation";
			definition = "Tax information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MTAX";
		}
	};
	/**
	 * Amendment of order confirmation not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NATA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedtoAmend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment of order confirmation not allowed."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode NotAllowedtoAmend = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllowedtoAmend";
			definition = "Amendment of order confirmation not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "NATA";
		}
	};
	/**
	 * Amendment of order confirmation too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentTooLate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment of order confirmation too late."</li>
	 * </ul>
	 */
	public static final RejectedConfirmationStatusReasonCode AmendmentTooLate = new RejectedConfirmationStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentTooLate";
			definition = "Amendment of order confirmation too late.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ALAT";
		}
	};
	final static private LinkedHashMap<String, RejectedConfirmationStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected RejectedConfirmationStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DSAF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedConfirmationStatusReasonCode";
				definition = "Specifies the reason for a confirmation rejected status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentInvestmentAccountDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentFinancialInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentBeneficiaryDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPlaceOfTrade, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentOrderDateTime,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentCancellationRight, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentUnitsNumber,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentOrderType, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentRounding,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentNetAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentGrossAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentHoldingsRedemptionRate, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentGroup1Or2Units,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentIncomePreference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentLetterIntentReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentAccumulationRightReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryIndicator,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentRequestedSettlementCurrency, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentRequestedNAVCurrency,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentForeignExchangeDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentChargeDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentCommissionDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentTaxDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentSettlementAndCustodyDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPaymentInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentSettlementAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentSettlementDate, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentExtensionDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentIntermediaryDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentTotalRedemptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentTotalSubscriptionAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentAdditionalCashIn,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentResultingCashOut, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPercentageOfTotalSubscriptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPercentageOfTotalRedemptionAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentLegIdentification,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentOrderReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.UnknownLinkagesReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DuplicateDealReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.ReceivingAgent,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.ReceiversCustodian, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.ReceiversIntermediary,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DeliveringAgent, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DeliverersCustodian,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DeliverersIntermediary, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.InvalidCreditTransfer,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.SettlementAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.SettlementDate,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingEUTaxInformation,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingCommission, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingCharge,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingTaxInformation, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.NotAllowedtoAmend,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.AmendmentTooLate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DifferentInvestmentAccountDetails.getCodeName().get(), DifferentInvestmentAccountDetails);
		codesByName.put(DifferentFinancialInstrumentDetails.getCodeName().get(), DifferentFinancialInstrumentDetails);
		codesByName.put(DifferentBeneficiaryDetails.getCodeName().get(), DifferentBeneficiaryDetails);
		codesByName.put(DifferentPlaceOfTrade.getCodeName().get(), DifferentPlaceOfTrade);
		codesByName.put(DifferentOrderDateTime.getCodeName().get(), DifferentOrderDateTime);
		codesByName.put(DifferentCancellationRight.getCodeName().get(), DifferentCancellationRight);
		codesByName.put(DifferentUnitsNumber.getCodeName().get(), DifferentUnitsNumber);
		codesByName.put(DifferentOrderType.getCodeName().get(), DifferentOrderType);
		codesByName.put(DifferentRounding.getCodeName().get(), DifferentRounding);
		codesByName.put(DifferentNetAmount.getCodeName().get(), DifferentNetAmount);
		codesByName.put(DifferentGrossAmount.getCodeName().get(), DifferentGrossAmount);
		codesByName.put(DifferentHoldingsRedemptionRate.getCodeName().get(), DifferentHoldingsRedemptionRate);
		codesByName.put(DifferentGroup1Or2Units.getCodeName().get(), DifferentGroup1Or2Units);
		codesByName.put(DifferentIncomePreference.getCodeName().get(), DifferentIncomePreference);
		codesByName.put(DifferentLetterIntentReference.getCodeName().get(), DifferentLetterIntentReference);
		codesByName.put(DifferentAccumulationRightReference.getCodeName().get(), DifferentAccumulationRightReference);
		codesByName.put(DifferentPhysicalDeliveryIndicator.getCodeName().get(), DifferentPhysicalDeliveryIndicator);
		codesByName.put(DifferentRequestedSettlementCurrency.getCodeName().get(), DifferentRequestedSettlementCurrency);
		codesByName.put(DifferentRequestedNAVCurrency.getCodeName().get(), DifferentRequestedNAVCurrency);
		codesByName.put(DifferentForeignExchangeDetails.getCodeName().get(), DifferentForeignExchangeDetails);
		codesByName.put(DifferentChargeDetails.getCodeName().get(), DifferentChargeDetails);
		codesByName.put(DifferentCommissionDetails.getCodeName().get(), DifferentCommissionDetails);
		codesByName.put(DifferentTaxDetails.getCodeName().get(), DifferentTaxDetails);
		codesByName.put(DifferentPhysicalDeliveryDetails.getCodeName().get(), DifferentPhysicalDeliveryDetails);
		codesByName.put(DifferentSettlementAndCustodyDetails.getCodeName().get(), DifferentSettlementAndCustodyDetails);
		codesByName.put(DifferentPaymentInstrumentDetails.getCodeName().get(), DifferentPaymentInstrumentDetails);
		codesByName.put(DifferentSettlementAmount.getCodeName().get(), DifferentSettlementAmount);
		codesByName.put(DifferentSettlementDate.getCodeName().get(), DifferentSettlementDate);
		codesByName.put(DifferentExtensionDetails.getCodeName().get(), DifferentExtensionDetails);
		codesByName.put(DifferentIntermediaryDetails.getCodeName().get(), DifferentIntermediaryDetails);
		codesByName.put(DifferentTotalRedemptionAmount.getCodeName().get(), DifferentTotalRedemptionAmount);
		codesByName.put(DifferentTotalSubscriptionAmount.getCodeName().get(), DifferentTotalSubscriptionAmount);
		codesByName.put(DifferentAdditionalCashIn.getCodeName().get(), DifferentAdditionalCashIn);
		codesByName.put(DifferentResultingCashOut.getCodeName().get(), DifferentResultingCashOut);
		codesByName.put(DifferentPercentageOfTotalSubscriptionAmount.getCodeName().get(), DifferentPercentageOfTotalSubscriptionAmount);
		codesByName.put(DifferentPercentageOfTotalRedemptionAmount.getCodeName().get(), DifferentPercentageOfTotalRedemptionAmount);
		codesByName.put(DifferentLegIdentification.getCodeName().get(), DifferentLegIdentification);
		codesByName.put(DifferentOrderReference.getCodeName().get(), DifferentOrderReference);
		codesByName.put(UnknownLinkagesReference.getCodeName().get(), UnknownLinkagesReference);
		codesByName.put(DuplicateDealReference.getCodeName().get(), DuplicateDealReference);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(ReceiversCustodian.getCodeName().get(), ReceiversCustodian);
		codesByName.put(ReceiversIntermediary.getCodeName().get(), ReceiversIntermediary);
		codesByName.put(DeliveringAgent.getCodeName().get(), DeliveringAgent);
		codesByName.put(DeliverersCustodian.getCodeName().get(), DeliverersCustodian);
		codesByName.put(DeliverersIntermediary.getCodeName().get(), DeliverersIntermediary);
		codesByName.put(InvalidCreditTransfer.getCodeName().get(), InvalidCreditTransfer);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
		codesByName.put(MissingEUTaxInformation.getCodeName().get(), MissingEUTaxInformation);
		codesByName.put(MissingCommission.getCodeName().get(), MissingCommission);
		codesByName.put(MissingCharge.getCodeName().get(), MissingCharge);
		codesByName.put(MissingTaxInformation.getCodeName().get(), MissingTaxInformation);
		codesByName.put(NotAllowedtoAmend.getCodeName().get(), NotAllowedtoAmend);
		codesByName.put(AmendmentTooLate.getCodeName().get(), AmendmentTooLate);
	}

	public static RejectedConfirmationStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectedConfirmationStatusReasonCode[] values() {
		RejectedConfirmationStatusReasonCode[] values = new RejectedConfirmationStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectedConfirmationStatusReasonCode> {
		@Override
		public RejectedConfirmationStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectedConfirmationStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}