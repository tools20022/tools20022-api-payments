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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of service for which a charge is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#BrokerageFee
 * ChargeTypeCode.BrokerageFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Commission
 * ChargeTypeCode.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#BackEndLoad
 * ChargeTypeCode.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#FrontEndLoad
 * ChargeTypeCode.FrontEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Switch
 * ChargeTypeCode.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#DilutionLevy
 * ChargeTypeCode.DilutionLevy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Discount
 * ChargeTypeCode.Discount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#ManagementFee
 * ChargeTypeCode.ManagementFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#TransferFee
 * ChargeTypeCode.TransferFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#MatchingFees
 * ChargeTypeCode.MatchingFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#PostageCharge
 * ChargeTypeCode.PostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#RegulatoryFee
 * ChargeTypeCode.RegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#ShippingCharge
 * ChargeTypeCode.ShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#ServiceProvisionFee
 * ChargeTypeCode.ServiceProvisionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#SpecialConcessions
 * ChargeTypeCode.SpecialConcessions}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#PartAcquis
 * ChargeTypeCode.PartAcquis}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Penalty
 * ChargeTypeCode.Penalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#ContingencyDeferredSalesCharge
 * ChargeTypeCode.ContingencyDeferredSalesCharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Other
 * ChargeTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Equalisation
 * ChargeTypeCode.Equalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#CorrespondentBankCharge
 * ChargeTypeCode.CorrespondentBankCharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Premium
 * ChargeTypeCode.Premium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Initial
 * ChargeTypeCode.Initial}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#AdvisoryFee
 * ChargeTypeCode.AdvisoryFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#CustodyFee
 * ChargeTypeCode.CustodyFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#PublicationFee
 * ChargeTypeCode.PublicationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#AccountingFee
 * ChargeTypeCode.AccountingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#SignatureService
 * ChargeTypeCode.SignatureService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#StorageAtDestination
 * ChargeTypeCode.StorageAtDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#StorageAtOrigin
 * ChargeTypeCode.StorageAtOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#Packaging
 * ChargeTypeCode.Packaging}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#PickUp
 * ChargeTypeCode.PickUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#DangerousGoodsFee
 * ChargeTypeCode.DangerousGoodsFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#SecurityCharge
 * ChargeTypeCode.SecurityCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#InsurancePremium
 * ChargeTypeCode.InsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#CollectFreight
 * ChargeTypeCode.CollectFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#ClearanceAndHandlingAtOrigin
 * ChargeTypeCode.ClearanceAndHandlingAtOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#ClearanceAndHandlingAtDestination
 * ChargeTypeCode.ClearanceAndHandlingAtDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#AirWayBillFee
 * ChargeTypeCode.AirWayBillFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#TransportCharges
 * ChargeTypeCode.TransportCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#UCITSCommission
 * ChargeTypeCode.UCITSCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#SpeciallyAgreedFrontEndLoad
 * ChargeTypeCode.SpeciallyAgreedFrontEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#ADRFee
 * ChargeTypeCode.ADRFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#IssuanceCancellationFee
 * ChargeTypeCode.IssuanceCancellationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#MiscellaneousFee
 * ChargeTypeCode.MiscellaneousFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#IssuanceFee
 * ChargeTypeCode.IssuanceFee}</li>
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
 * <li>"BRKF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service for which a charge is asked or paid."</li>
 * </ul>
 */
public class ChargeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fee paid to a broker for services provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRKF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid to a broker for services provided."</li>
	 * </ul>
	 */
	public static final MMCode BrokerageFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerageFee";
			definition = "Fee paid to a broker for services provided.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "BRKF";
		}
	};
	/**
	 * Fee paid for services provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid for services provided."</li>
	 * </ul>
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Fee paid for services provided.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Sales charge paid by the investor when redeeming an investment such as an
	 * investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sales charge paid by the investor when redeeming an investment such as an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BackEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndLoad";
			definition = "Sales charge paid by the investor when redeeming an investment such as an investment fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "BEND";
		}
	};
	/**
	 * Sales charge paid immediately by the investor when subscribing to an
	 * investment such as an investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sales charge paid immediately by the investor when subscribing to an investment such as an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FrontEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndLoad";
			definition = "Sales charge paid immediately by the investor when subscribing to an investment such as an investment fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * In investment funds, charge related to a switch transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, charge related to a switch transaction."</li>
	 * </ul>
	 */
	public static final MMCode Switch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Switch";
			definition = "In investment funds, charge related to a switch transaction.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SWIT";
		}
	};
	/**
	 * In investment funds, a charge payable by the investor covering bid-offer
	 * spreads and dealing charges for the underlying investments. The dilution
	 * levy is paid to the fund for the benefit of other unit holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DilutionLevy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, a charge payable by the investor covering bid-offer spreads and dealing charges for the underlying investments. The dilution levy is paid to the fund for the benefit of other unit holders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DilutionLevy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DilutionLevy";
			definition = "In investment funds, a charge payable by the investor covering bid-offer spreads and dealing charges for the underlying investments. The dilution levy is paid to the fund for the benefit of other unit holders.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "DLEV";
		}
	};
	/**
	 * Charge that has been reduced from the standard initial charge levied by a
	 * fund, eg, during a launch period or as negotiated by a funds supermarket
	 * / discount broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge that has been reduced from the standard initial charge levied by a fund, eg, during a launch period or as negotiated by a funds supermarket / discount broker."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Discount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Charge that has been reduced from the standard initial charge levied by a fund, eg, during a launch period or as negotiated by a funds supermarket / discount broker.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Fee paid to an investment manager for services. The fee usually includes
	 * fund administration costs and investor relationship management.
	 * Typically, the amount paid is a percentage of the assets under
	 * management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee paid to an investment manager for services. The fee usually includes fund administration costs and investor relationship management. Typically, the amount paid is a percentage of the assets under management."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ManagementFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementFee";
			definition = "Fee paid to an investment manager for services. The fee usually includes fund administration costs and investor relationship management. Typically, the amount paid is a percentage of the assets under management.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "MANF";
		}
	};
	/**
	 * In investment funds, a fee charged for the transfer of ownership of an
	 * investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, a fee charged for the transfer of ownership of an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TransferFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferFee";
			definition = "In investment funds, a fee charged for the transfer of ownership of an investment fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Fee charged for matching and/or confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee charged for matching and/or confirmation."</li>
	 * </ul>
	 */
	public static final MMCode MatchingFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingFees";
			definition = "Fee charged for matching and/or confirmation.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "MACO";
		}
	};
	/**
	 * Charge paid for the postage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge paid for the postage."</li>
	 * </ul>
	 */
	public static final MMCode PostageCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostageCharge";
			definition = "Charge paid for the postage.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Fee charged by a regulatory authority, eg, Securities and Exchange fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee charged by a regulatory authority, eg, Securities and Exchange fees."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RegulatoryFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryFee";
			definition = "Fee charged by a regulatory authority, eg, Securities and Exchange fees.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "REGF";
		}
	};
	/**
	 * Charge for shipping, including the insurance of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge for shipping, including the insurance of securities."</li>
	 * </ul>
	 */
	public static final MMCode ShippingCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShippingCharge";
			definition = "Charge for shipping, including the insurance of securities.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SHIP";
		}
	};
	/**
	 * Fee paid for the provision of financial services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceProvisionFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid for the provision of financial services."</li>
	 * </ul>
	 */
	public static final MMCode ServiceProvisionFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceProvisionFee";
			definition = "Fee paid for the provision of financial services.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Charges, drawdown, or other reduction from or in addition to the deal
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConcessions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charges, drawdown, or other reduction from or in addition to the deal price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SpecialConcessions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialConcessions";
			definition = "Charges, drawdown, or other reduction from or in addition to the deal price.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SPCN";
		}
	};
	/**
	 * Portion of charge that the fund is entitled to receive, that cannot be
	 * reduced by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartAcquis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of charge that the fund is entitled to receive, that cannot be reduced by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartAcquis = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartAcquis";
			definition = "Portion of charge that the fund is entitled to receive, that cannot be reduced by an intermediary.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PACQ";
		}
	};
	/**
	 * Fee charged to the investor for early redemption of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Penalty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee charged to the investor for early redemption of the fund."</li>
	 * </ul>
	 */
	public static final MMCode Penalty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Penalty";
			definition = "Fee charged to the investor for early redemption of the fund.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PENA";
		}
	};
	/**
	 * Deferred sales charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingencyDeferredSalesCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deferred sales charge."</li>
	 * </ul>
	 */
	public static final MMCode ContingencyDeferredSalesCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContingencyDeferredSalesCharge";
			definition = "Deferred sales charge.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CDSC";
		}
	};
	/**
	 * Another type of charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of charge."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of charge.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * The part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive or performance fees at the end of the fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Equalisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "EQUL";
		}
	};
	/**
	 * In investment funds, the charge of the correspondent bank for
	 * transferring money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, the charge of the correspondent bank for transferring money."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CorrespondentBankCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorrespondentBankCharge";
			definition = "In investment funds, the charge of the correspondent bank for transferring money.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CBCH";
		}
	};
	/**
	 * In investment funds, pre-arranged addition to the trade amount based on
	 * the published net asset value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, pre-arranged addition to the trade amount based on the published net asset value."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Premium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "In investment funds, pre-arranged addition to the trade amount based on the published net asset value.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PREM";
		}
	};
	/**
	 * Charge paid at the time of the first subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge paid at the time of the first subscription."</li>
	 * </ul>
	 */
	public static final MMCode Initial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Initial";
			definition = "Charge paid at the time of the first subscription.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * Fee paid for advisory services rendered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisoryFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid for advisory services rendered."</li>
	 * </ul>
	 */
	public static final MMCode AdvisoryFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdvisoryFee";
			definition = "Fee paid for advisory services rendered.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ADVI";
		}
	};
	/**
	 * Fee paid to a custodian in respect of custodial services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid to a custodian in respect of custodial services."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CustodyFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustodyFee";
			definition = "Fee paid to a custodian in respect of custodial services.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Fee paid in respect of publications made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicationFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid in respect of publications made."</li>
	 * </ul>
	 */
	public static final MMCode PublicationFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PublicationFee";
			definition = "Fee paid in respect of publications made.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PUBL";
		}
	};
	/**
	 * Fee paid for accounting services rendered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid for accounting services rendered."</li>
	 * </ul>
	 */
	public static final MMCode AccountingFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountingFee";
			definition = "Fee paid for accounting services rendered.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Charge is for signature services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for signature services."</li>
	 * </ul>
	 */
	public static final MMCode SignatureService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureService";
			definition = "Charge is for signature services.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * Charge is for storage of goods at destination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StorageAtDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for storage of goods at destination."</li>
	 * </ul>
	 */
	public static final MMCode StorageAtDestination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StorageAtDestination";
			definition = "Charge is for storage of goods at destination.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "STDE";
		}
	};
	/**
	 * Charge is for storage of goods at origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StorageAtOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for storage of goods at origin."</li>
	 * </ul>
	 */
	public static final MMCode StorageAtOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StorageAtOrigin";
			definition = "Charge is for storage of goods at origin.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "STOR";
		}
	};
	/**
	 * Charge is for packaging of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for packaging of goods."</li>
	 * </ul>
	 */
	public static final MMCode Packaging = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Charge is for packaging of goods.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Charge is for pick-up of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for pick-up of goods."</li>
	 * </ul>
	 */
	public static final MMCode PickUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PickUp";
			definition = "Charge is for pick-up of goods.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "PICK";
		}
	};
	/**
	 * Charge is for dangerous goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DangerousGoodsFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for dangerous goods."</li>
	 * </ul>
	 */
	public static final MMCode DangerousGoodsFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DangerousGoodsFee";
			definition = "Charge is for dangerous goods.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "DNGR";
		}
	};
	/**
	 * Charge is for security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for security."</li>
	 * </ul>
	 */
	public static final MMCode SecurityCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCharge";
			definition = "Charge is for security.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Charge is a premium for insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is a premium for insurance."</li>
	 * </ul>
	 */
	public static final MMCode InsurancePremium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsurancePremium";
			definition = "Charge is a premium for insurance.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Charge is for the collection of the freight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectFreight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for the collection of the freight."</li>
	 * </ul>
	 */
	public static final MMCode CollectFreight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectFreight";
			definition = "Charge is for the collection of the freight.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "COLF";
		}
	};
	/**
	 * Charge is for clearance and handling of goods at origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearanceAndHandlingAtOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for clearance and handling of goods at origin."</li>
	 * </ul>
	 */
	public static final MMCode ClearanceAndHandlingAtOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearanceAndHandlingAtOrigin";
			definition = "Charge is for clearance and handling of goods at origin.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CHOR";
		}
	};
	/**
	 * Charge is for clearance and handling of goods at destination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearanceAndHandlingAtDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is for clearance and handling of goods at destination."</li>
	 * </ul>
	 */
	public static final MMCode ClearanceAndHandlingAtDestination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearanceAndHandlingAtDestination";
			definition = "Charge is for clearance and handling of goods at destination.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "CHDE";
		}
	};
	/**
	 * Charge is an airway bill fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirWayBillFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is an airway bill fee."</li>
	 * </ul>
	 */
	public static final MMCode AirWayBillFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AirWayBillFee";
			definition = "Charge is an airway bill fee.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "AIRF";
		}
	};
	/**
	 * Charge is for transport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge is for transport."</li>
	 * </ul>
	 */
	public static final MMCode TransportCharges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charge is for transport.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "TRPT";
		}
	};
	/**
	 * Charges paid by the investor to the Fund Company for subscription and
	 * redemption orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITSCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charges paid by the investor to the Fund Company for subscription and redemption orders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode UCITSCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UCITSCommission";
			definition = "Charges paid by the investor to the Fund Company for subscription and redemption orders.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "UCIC";
		}
	};
	/**
	 * Specially agreed front-end load.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpeciallyAgreedFrontEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specially agreed front-end load."</li>
	 * </ul>
	 */
	public static final MMCode SpeciallyAgreedFrontEndLoad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpeciallyAgreedFrontEndLoad";
			definition = "Specially agreed front-end load.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "SFEN";
		}
	};
	/**
	 * Charge linked to an ADR (American Depositary Receipt).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge linked to an ADR (American Depositary Receipt)."</li>
	 * </ul>
	 */
	public static final MMCode ADRFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ADRFee";
			definition = "Charge linked to an ADR (American Depositary Receipt).";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ADRF";
		}
	};
	/**
	 * Fee linked to the cancellation of an issuance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceCancellationFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee linked to the cancellation of an issuance."</li>
	 * </ul>
	 */
	public static final MMCode IssuanceCancellationFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuanceCancellationFee";
			definition = "Fee linked to the cancellation of an issuance.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ISSC";
		}
	};
	/**
	 * Miscellaneous fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Miscellaneous fee."</li>
	 * </ul>
	 */
	public static final MMCode MiscellaneousFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiscellaneousFee";
			definition = "Miscellaneous fee.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "MISC";
		}
	};
	/**
	 * Charge linked to the issuance of security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge linked to the issuance of security."</li>
	 * </ul>
	 */
	public static final MMCode IssuanceFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuanceFee";
			definition = "Charge linked to the issuance of security.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ISSU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BRKF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChargeTypeCode";
				definition = "Type of service for which a charge is asked or paid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeTypeCode.BrokerageFee, com.tools20022.repository.codeset.ChargeTypeCode.Commission, com.tools20022.repository.codeset.ChargeTypeCode.BackEndLoad,
						com.tools20022.repository.codeset.ChargeTypeCode.FrontEndLoad, com.tools20022.repository.codeset.ChargeTypeCode.Switch, com.tools20022.repository.codeset.ChargeTypeCode.DilutionLevy,
						com.tools20022.repository.codeset.ChargeTypeCode.Discount, com.tools20022.repository.codeset.ChargeTypeCode.ManagementFee, com.tools20022.repository.codeset.ChargeTypeCode.TransferFee,
						com.tools20022.repository.codeset.ChargeTypeCode.MatchingFees, com.tools20022.repository.codeset.ChargeTypeCode.PostageCharge, com.tools20022.repository.codeset.ChargeTypeCode.RegulatoryFee,
						com.tools20022.repository.codeset.ChargeTypeCode.ShippingCharge, com.tools20022.repository.codeset.ChargeTypeCode.ServiceProvisionFee, com.tools20022.repository.codeset.ChargeTypeCode.SpecialConcessions,
						com.tools20022.repository.codeset.ChargeTypeCode.PartAcquis, com.tools20022.repository.codeset.ChargeTypeCode.Penalty, com.tools20022.repository.codeset.ChargeTypeCode.ContingencyDeferredSalesCharge,
						com.tools20022.repository.codeset.ChargeTypeCode.Other, com.tools20022.repository.codeset.ChargeTypeCode.Equalisation, com.tools20022.repository.codeset.ChargeTypeCode.CorrespondentBankCharge,
						com.tools20022.repository.codeset.ChargeTypeCode.Premium, com.tools20022.repository.codeset.ChargeTypeCode.Initial, com.tools20022.repository.codeset.ChargeTypeCode.AdvisoryFee,
						com.tools20022.repository.codeset.ChargeTypeCode.CustodyFee, com.tools20022.repository.codeset.ChargeTypeCode.PublicationFee, com.tools20022.repository.codeset.ChargeTypeCode.AccountingFee,
						com.tools20022.repository.codeset.ChargeTypeCode.SignatureService, com.tools20022.repository.codeset.ChargeTypeCode.StorageAtDestination, com.tools20022.repository.codeset.ChargeTypeCode.StorageAtOrigin,
						com.tools20022.repository.codeset.ChargeTypeCode.Packaging, com.tools20022.repository.codeset.ChargeTypeCode.PickUp, com.tools20022.repository.codeset.ChargeTypeCode.DangerousGoodsFee,
						com.tools20022.repository.codeset.ChargeTypeCode.SecurityCharge, com.tools20022.repository.codeset.ChargeTypeCode.InsurancePremium, com.tools20022.repository.codeset.ChargeTypeCode.CollectFreight,
						com.tools20022.repository.codeset.ChargeTypeCode.ClearanceAndHandlingAtOrigin, com.tools20022.repository.codeset.ChargeTypeCode.ClearanceAndHandlingAtDestination,
						com.tools20022.repository.codeset.ChargeTypeCode.AirWayBillFee, com.tools20022.repository.codeset.ChargeTypeCode.TransportCharges, com.tools20022.repository.codeset.ChargeTypeCode.UCITSCommission,
						com.tools20022.repository.codeset.ChargeTypeCode.SpeciallyAgreedFrontEndLoad, com.tools20022.repository.codeset.ChargeTypeCode.ADRFee, com.tools20022.repository.codeset.ChargeTypeCode.IssuanceCancellationFee,
						com.tools20022.repository.codeset.ChargeTypeCode.MiscellaneousFee, com.tools20022.repository.codeset.ChargeTypeCode.IssuanceFee);
			}
		});
		return mmObject_lazy.get();
	}
}