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
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmBrokerageFee
 * ChargeTypeCode.mmBrokerageFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmCommission
 * ChargeTypeCode.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmBackEndLoad
 * ChargeTypeCode.mmBackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmFrontEndLoad
 * ChargeTypeCode.mmFrontEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmSwitch
 * ChargeTypeCode.mmSwitch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmDilutionLevy
 * ChargeTypeCode.mmDilutionLevy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmDiscount
 * ChargeTypeCode.mmDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmManagementFee
 * ChargeTypeCode.mmManagementFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmTransferFee
 * ChargeTypeCode.mmTransferFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmMatchingFees
 * ChargeTypeCode.mmMatchingFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmPostageCharge
 * ChargeTypeCode.mmPostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmRegulatoryFee
 * ChargeTypeCode.mmRegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmShippingCharge
 * ChargeTypeCode.mmShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmServiceProvisionFee
 * ChargeTypeCode.mmServiceProvisionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmSpecialConcessions
 * ChargeTypeCode.mmSpecialConcessions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmPartAcquis
 * ChargeTypeCode.mmPartAcquis}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmPenalty
 * ChargeTypeCode.mmPenalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmContingencyDeferredSalesCharge
 * ChargeTypeCode.mmContingencyDeferredSalesCharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmOther
 * ChargeTypeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmEqualisation
 * ChargeTypeCode.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmCorrespondentBankCharge
 * ChargeTypeCode.mmCorrespondentBankCharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmPremium
 * ChargeTypeCode.mmPremium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmInitial
 * ChargeTypeCode.mmInitial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmAdvisoryFee
 * ChargeTypeCode.mmAdvisoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmCustodyFee
 * ChargeTypeCode.mmCustodyFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmPublicationFee
 * ChargeTypeCode.mmPublicationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmAccountingFee
 * ChargeTypeCode.mmAccountingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmSignatureService
 * ChargeTypeCode.mmSignatureService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmStorageAtDestination
 * ChargeTypeCode.mmStorageAtDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmStorageAtOrigin
 * ChargeTypeCode.mmStorageAtOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmPackaging
 * ChargeTypeCode.mmPackaging}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmPickUp
 * ChargeTypeCode.mmPickUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmDangerousGoodsFee
 * ChargeTypeCode.mmDangerousGoodsFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmSecurityCharge
 * ChargeTypeCode.mmSecurityCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmInsurancePremium
 * ChargeTypeCode.mmInsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmCollectFreight
 * ChargeTypeCode.mmCollectFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmClearanceAndHandlingAtOrigin
 * ChargeTypeCode.mmClearanceAndHandlingAtOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmClearanceAndHandlingAtDestination
 * ChargeTypeCode.mmClearanceAndHandlingAtDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmAirWayBillFee
 * ChargeTypeCode.mmAirWayBillFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmTransportCharges
 * ChargeTypeCode.mmTransportCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmUCITSCommission
 * ChargeTypeCode.mmUCITSCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmSpeciallyAgreedFrontEndLoad
 * ChargeTypeCode.mmSpeciallyAgreedFrontEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmADRFee
 * ChargeTypeCode.mmADRFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmIssuanceCancellationFee
 * ChargeTypeCode.mmIssuanceCancellationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmMiscellaneousFee
 * ChargeTypeCode.mmMiscellaneousFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode#mmIssuanceFee
 * ChargeTypeCode.mmIssuanceFee}</li>
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
	public static final MMCode mmBrokerageFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmCommission = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmBackEndLoad = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmFrontEndLoad = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSwitch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmDilutionLevy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmDiscount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmManagementFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmTransferFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmMatchingFees = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPostageCharge = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmRegulatoryFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmShippingCharge = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmServiceProvisionFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSpecialConcessions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPartAcquis = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPenalty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmContingencyDeferredSalesCharge = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmEqualisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmCorrespondentBankCharge = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPremium = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmInitial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmAdvisoryFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmCustodyFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPublicationFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmAccountingFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSignatureService = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmStorageAtDestination = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmStorageAtOrigin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPackaging = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmPickUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmDangerousGoodsFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSecurityCharge = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmInsurancePremium = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmCollectFreight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmClearanceAndHandlingAtOrigin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmClearanceAndHandlingAtDestination = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmAirWayBillFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmTransportCharges = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmUCITSCommission = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmSpeciallyAgreedFrontEndLoad = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmADRFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmIssuanceCancellationFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmMiscellaneousFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
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
	public static final MMCode mmIssuanceFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuanceFee";
			definition = "Charge linked to the issuance of security.";
			owner_lazy = () -> ChargeTypeCode.mmObject();
			codeName = "ISSU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BRKF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeTypeCode";
				definition = "Type of service for which a charge is asked or paid.";
				code_lazy = () -> Arrays.asList(ChargeTypeCode.mmBrokerageFee, ChargeTypeCode.mmCommission, ChargeTypeCode.mmBackEndLoad, ChargeTypeCode.mmFrontEndLoad, ChargeTypeCode.mmSwitch, ChargeTypeCode.mmDilutionLevy,
						ChargeTypeCode.mmDiscount, ChargeTypeCode.mmManagementFee, ChargeTypeCode.mmTransferFee, ChargeTypeCode.mmMatchingFees, ChargeTypeCode.mmPostageCharge, ChargeTypeCode.mmRegulatoryFee,
						ChargeTypeCode.mmShippingCharge, ChargeTypeCode.mmServiceProvisionFee, ChargeTypeCode.mmSpecialConcessions, ChargeTypeCode.mmPartAcquis, ChargeTypeCode.mmPenalty, ChargeTypeCode.mmContingencyDeferredSalesCharge,
						ChargeTypeCode.mmOther, ChargeTypeCode.mmEqualisation, ChargeTypeCode.mmCorrespondentBankCharge, ChargeTypeCode.mmPremium, ChargeTypeCode.mmInitial, ChargeTypeCode.mmAdvisoryFee, ChargeTypeCode.mmCustodyFee,
						ChargeTypeCode.mmPublicationFee, ChargeTypeCode.mmAccountingFee, ChargeTypeCode.mmSignatureService, ChargeTypeCode.mmStorageAtDestination, ChargeTypeCode.mmStorageAtOrigin, ChargeTypeCode.mmPackaging,
						ChargeTypeCode.mmPickUp, ChargeTypeCode.mmDangerousGoodsFee, ChargeTypeCode.mmSecurityCharge, ChargeTypeCode.mmInsurancePremium, ChargeTypeCode.mmCollectFreight, ChargeTypeCode.mmClearanceAndHandlingAtOrigin,
						ChargeTypeCode.mmClearanceAndHandlingAtDestination, ChargeTypeCode.mmAirWayBillFee, ChargeTypeCode.mmTransportCharges, ChargeTypeCode.mmUCITSCommission, ChargeTypeCode.mmSpeciallyAgreedFrontEndLoad,
						ChargeTypeCode.mmADRFee, ChargeTypeCode.mmIssuanceCancellationFee, ChargeTypeCode.mmMiscellaneousFee, ChargeTypeCode.mmIssuanceFee);
			}
		});
		return mmObject_lazy.get();
	}
}