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
 * Specifies the entitled party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmSaleSystem
 * PartyTypeCode.mmSaleSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmPOIComponent
 * PartyTypeCode.mmPOIComponent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmIssuer
 * PartyTypeCode.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmHolder
 * PartyTypeCode.mmHolder}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmInvestor
 * PartyTypeCode.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmExecutingFirm
 * PartyTypeCode.mmExecutingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmBrokerOfCredit
 * PartyTypeCode.mmBrokerOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmCorrespondentClearingFirm
 * PartyTypeCode.mmCorrespondentClearingFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmContraFirm
 * PartyTypeCode.mmContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmContraClearingFirm
 * PartyTypeCode.mmContraClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmUnderlyingContraFirm
 * PartyTypeCode.mmUnderlyingContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmGiveUpClearingFirm
 * PartyTypeCode.mmGiveUpClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmOrderOriginationFirm
 * PartyTypeCode.mmOrderOriginationFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmSponsoringFirm
 * PartyTypeCode.mmSponsoringFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmClearingfirm
 * PartyTypeCode.mmClearingfirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmIntroducingFirm
 * PartyTypeCode.mmIntroducingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmEnteringFirm
 * PartyTypeCode.mmEnteringFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmClient
 * PartyTypeCode.mmClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmStepInBroker
 * PartyTypeCode.mmStepInBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmAffirmingParty
 * PartyTypeCode.mmAffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmETCServiceProvider1
 * PartyTypeCode.mmETCServiceProvider1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmETCServiceProvider2
 * PartyTypeCode.mmETCServiceProvider2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmRequestedBroker
 * PartyTypeCode.mmRequestedBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmTaxAuthority
 * PartyTypeCode.mmTaxAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmDelegateIssuer
 * PartyTypeCode.mmDelegateIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmOriginatingPOI
 * PartyTypeCode.mmOriginatingPOI}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmCardIssuer
 * PartyTypeCode.mmCardIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmAcceptor
 * PartyTypeCode.mmAcceptor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmMerchant
 * PartyTypeCode.mmMerchant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmAcquirer
 * PartyTypeCode.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmIntermediaryAgent
 * PartyTypeCode.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmMasterTerminalManager
 * PartyTypeCode.mmMasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmTerminalManager
 * PartyTypeCode.mmTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmAcquirerProcessor
 * PartyTypeCode.mmAcquirerProcessor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmCardIssuerProcessor
 * PartyTypeCode.mmCardIssuerProcessor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmCardScheme
 * PartyTypeCode.mmCardScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmCardSchemeProcessor
 * PartyTypeCode.mmCardSchemeProcessor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmATMManager
 * PartyTypeCode.mmATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmHostingEntity
 * PartyTypeCode.mmHostingEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmOriginatingATM
 * PartyTypeCode.mmOriginatingATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmOriginatingTerminal
 * PartyTypeCode.mmOriginatingTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmCardApplication
 * PartyTypeCode.mmCardApplication}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmPOISystem
 * PartyTypeCode.mmPOISystem}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmPOIGroup
 * PartyTypeCode.mmPOIGroup}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmSinglePOI
 * PartyTypeCode.mmSinglePOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmAccountFromBank
 * PartyTypeCode.mmAccountFromBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#mmAccountToBank
 * PartyTypeCode.mmAccountToBank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType3Code
 * PartyType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType4Code
 * PartyType4Code}</li>
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
 * <li>"ISUR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the entitled party."</li>
 * </ul>
 */
public class PartyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party selling goods and services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party selling goods and services."</li>
	 * </ul>
	 */
	public static final MMCode mmSaleSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SaleSystem";
			definition = "Party selling goods and services.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "SALE";
		}
	};
	/**
	 * Party component of a POI system or POI terminal (Point of Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party component of a POI system or POI terminal (Point of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPOIComponent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "POIComponent";
			definition = "Party component of a POI system or POI terminal (Point of Interaction).";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PCPT";
		}
	};
	/**
	 * Issuer is the entitled party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISUR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer is the entitled party."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuer";
			definition = "Issuer is the entitled party.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ISUR";
		}
	};
	/**
	 * Holder is the entitled party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Holder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holder is the entitled party."</li>
	 * </ul>
	 */
	public static final MMCode mmHolder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Holder";
			definition = "Holder is the entitled party.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "HLDR";
		}
	};
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Party that identifies an executing / give-up broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that identifies an executing / give-up broker."</li>
	 * </ul>
	 */
	public static final MMCode mmExecutingFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingFirm";
			definition = "Party that identifies an executing / give-up broker.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Party that receives the trade credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BROK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that receives the trade credit."</li>
	 * </ul>
	 */
	public static final MMCode mmBrokerOfCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			definition = "Party that receives the trade credit.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "BROK";
		}
	};
	/**
	 * Party that is going to carry the position on their books at another
	 * clearinghouse (exchanges).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentClearingFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is going to carry the position on their books at another clearinghouse (exchanges)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCorrespondentClearingFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentClearingFirm";
			definition = "Party that is going to carry the position on their books at another clearinghouse (exchanges).";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Party that is the counterparty in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that is the counterparty in a trade."</li>
	 * </ul>
	 */
	public static final MMCode mmContraFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraFirm";
			definition = "Party that is the counterparty in a trade.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "COFI";
		}
	};
	/**
	 * Party that is the clearing firm of the counterparty in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraClearingFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the clearing firm of the counterparty in a trade."</li>
	 * </ul>
	 */
	public static final MMCode mmContraClearingFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraClearingFirm";
			definition = "Party that is the clearing firm of the counterparty in a trade.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "COCL";
		}
	};
	/**
	 * Party (broker or other firm), which is the contra side of the trade for
	 * the underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingContraFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party (broker or other firm), which is the contra side of the trade for the underlying security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnderlyingContraFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingContraFirm";
			definition = "Party (broker or other firm), which is the contra side of the trade for the underlying security.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "UNDE";
		}
	};
	/**
	 * Party to which the trade is given up (carries the position that results
	 * from a trade).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiveUpClearingFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the trade is given up (carries the position that results from a trade)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmGiveUpClearingFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiveUpClearingFirm";
			definition = "Party to which the trade is given up (carries the position that results from a trade).";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "GIVE";
		}
	};
	/**
	 * Party that originates an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginationFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that originates an order."</li>
	 * </ul>
	 */
	public static final MMCode mmOrderOriginationFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginationFirm";
			definition = "Party that originates an order.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ORDE";
		}
	};
	/**
	 * Party (member of an exchange)that is sponsoring an entering firm to send
	 * orders directly to the exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SponsoringFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSponsoringFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsoringFirm";
			definition = "Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "SPON";
		}
	};
	/**
	 * Party (broker) that settles security transactions from another broker for
	 * a fee = take up broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clearingfirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party (broker) that settles security transactions from another broker for a fee = take up broker."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClearingfirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clearingfirm";
			definition = "Party (broker) that settles security transactions from another broker for a fee = take up broker.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CLEA";
		}
	};
	/**
	 * Party that can relay an order directly to the trading floor, or give
	 * clients direct access to the floor. The introducing firm delegates the
	 * work of the floor operation, trade execution and accounting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntroducingFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIntroducingFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			definition = "Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Party that has recorded or reported an execution of a trade. When an
	 * entering firm that is not a party to a trade enters the trade into a
	 * trade recording system, any inquiries can be directed to the appropriate
	 * source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnteringFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEnteringFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnteringFirm";
			definition = "Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ENTE";
		}
	};
	/**
	 * A client is identified in third party-transactions or for investor in
	 * intermediary transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLIE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A client is identified in third party-transactions or for investor in intermediary transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClient = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "A client is identified in third party-transactions or for investor in intermediary transactions.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CLIE";
		}
	};
	/**
	 * Broker to which the investment manager directs the execution of a portion
	 * of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepInBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker to which the investment manager directs the execution of a portion of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStepInBroker = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepInBroker";
			definition = "Broker to which the investment manager directs the execution of a portion of the trade.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "STEP";
		}
	};
	/**
	 * Party (buyer or seller) that positively affirms the details of a
	 * previously agreed security trade confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAffirmingParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "AFFI";
		}
	};
	/**
	 * Party acting as the Electronic Trade Confirmation (ETC) service provider
	 * 1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETC1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ETCServiceProvider1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting as the Electronic Trade Confirmation (ETC) service provider 1."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmETCServiceProvider1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider1";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 1.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ETC1";
		}
	};
	/**
	 * Party acting as the Electronic Trade Confirmation (ETC) service provider
	 * 2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETC2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ETCServiceProvider2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting as the Electronic Trade Confirmation (ETC) service provider 2."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmETCServiceProvider2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider2";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 2.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ETC2";
		}
	};
	/**
	 * In a directed order, broker with which the Receiver of the message is
	 * requested to execute the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a directed order, broker with which the Receiver of the message is requested to execute the order."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRequestedBroker = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedBroker";
			definition = "In a directed order, broker with which the Receiver of the message is requested to execute the order.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "RQBR";
		}
	};
	/**
	 * Tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax authority."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxAuthority = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAuthority";
			definition = "Tax authority.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "TAXH";
		}
	};
	/**
	 * Party to whom the card issuer delegates to authorise card payment
	 * transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegateIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to whom the card issuer delegates to authorise card payment transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDelegateIssuer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DelegateIssuer";
			definition = "Party to whom the card issuer delegates to authorise card payment transactions.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "DLIS";
		}
	};
	/**
	 * Point Of Interaction initiating the card payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPOI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingPOI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point Of Interaction initiating the card payment transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOriginatingPOI = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginatingPOI";
			definition = "Point Of Interaction initiating the card payment transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "OPOI";
		}
	};
	/**
	 * Party that issues cards.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that issues cards."</li>
	 * </ul>
	 */
	public static final MMCode mmCardIssuer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardIssuer";
			definition = "Party that issues cards.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CISS";
		}
	};
	/**
	 * Card acceptor, party accepting the card and presenting transaction data
	 * to the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card acceptor, party accepting the card and presenting transaction data to the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acceptor";
			definition = "Card acceptor, party accepting the card and presenting transaction data to the acquirer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * Merchant providing goods and service in the card payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant providing goods and service in the card payment transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmMerchant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant providing goods and service in the card payment transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Entity acquiring card transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity acquiring card transactions."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acquirer";
			definition = "Entity acquiring card transactions.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ACQR";
		}
	};
	/**
	 * Party acting on behalf of other parties to process or forward data to
	 * other parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party acting on behalf of other parties to process or forward data to other parties."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIntermediaryAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediaryAgent";
			definition = "Party acting on behalf of other parties to process or forward data to other parties.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ITAG";
		}
	};
	/**
	 * Responsible for the maintenance of a card payment acceptance terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Responsible for the maintenance of a card payment acceptance terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmMasterTerminalManager = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterTerminalManager";
			definition = "Responsible for the maintenance of a card payment acceptance terminal.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "MTMG";
		}
	};
	/**
	 * Responsible for one or several maintenance functions of a card payment
	 * acceptance terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Responsible for one or several maintenance functions of a card payment acceptance terminal."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTerminalManager = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManager";
			definition = "Responsible for one or several maintenance functions of a card payment acceptance terminal.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "TMGT";
		}
	};
	/**
	 * Entity providing acquiring card payment processing services on behalf on
	 * an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProcessor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity providing acquiring card payment processing services on behalf on an acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerProcessor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProcessor";
			definition = "Entity providing acquiring card payment processing services on behalf on an acquirer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ACQP";
		}
	};
	/**
	 * Entity providing issuing card payment processing services on behalf on an
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuerProcessor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity providing issuing card payment processing services on behalf on an issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardIssuerProcessor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerProcessor";
			definition = "Entity providing issuing card payment processing services on behalf on an issuer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CISP";
		}
	};
	/**
	 * Entity defining rules and procedures for card payment transactions acting
	 * as an intermediary between an acquirer and an issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardScheme = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardScheme";
			definition = "Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CSCH";
		}
	};
	/**
	 * Entity providing card payment processing services acting on behalf of a
	 * card scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSchemeProcessor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity providing card payment processing services acting on behalf of a card scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardSchemeProcessor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSchemeProcessor";
			definition = "Entity providing card payment processing services acting on behalf of a card scheme.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "SCHP";
		}
	};
	/**
	 * Entity managing the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity managing the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmATMManager = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			definition = "Entity managing the ATM.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ATMG";
		}
	};
	/**
	 * Entity hosting the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HSTG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostingEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity hosting the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmHostingEntity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "HSTG";
		}
	};
	/**
	 * ATM initiating the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM initiating the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOriginatingATM = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingATM";
			definition = "ATM initiating the transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "OATM";
		}
	};
	/**
	 * Application on the terminal which has initiated the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingTerminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Application on the terminal which has initiated the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOriginatingTerminal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingTerminal";
			definition = "Application on the terminal which has initiated the transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "OTRM";
		}
	};
	/**
	 * Application in the smart card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Application in the smart card."</li>
	 * </ul>
	 */
	public static final MMCode mmCardApplication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			definition = "Application in the smart card.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ICCA";
		}
	};
	/**
	 * Configuration to apply to the whole POI system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POISystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration to apply to the whole POI system."</li>
	 * </ul>
	 */
	public static final MMCode mmPOISystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISystem";
			definition = "Configuration to apply to the whole POI system.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PSYS";
		}
	};
	/**
	 * Configuration to apply to a subset of the whole POI system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PGRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration to apply to a subset of the whole POI system."</li>
	 * </ul>
	 */
	public static final MMCode mmPOIGroup = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIGroup";
			definition = "Configuration to apply to a subset of the whole POI system.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PGRP";
		}
	};
	/**
	 * Configuration to apply to a single POI terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SinglePOI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration to apply to a single POI terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmSinglePOI = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SinglePOI";
			definition = "Configuration to apply to a single POI terminal.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PSNG";
		}
	};
	/**
	 * The bank of the source account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFromBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The bank of the source account."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountFromBank = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFromBank";
			definition = "The bank of the source account.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "BKAF";
		}
	};
	/**
	 * The bank of the destination account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountToBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The bank of the destination account."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountToBank = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountToBank";
			definition = "The bank of the destination account.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "BKAT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ISUR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyTypeCode";
				definition = "Specifies the entitled party.";
				code_lazy = () -> Arrays.asList(PartyTypeCode.mmSaleSystem, PartyTypeCode.mmPOIComponent, PartyTypeCode.mmIssuer, PartyTypeCode.mmHolder, PartyTypeCode.mmInvestor, PartyTypeCode.mmExecutingFirm,
						PartyTypeCode.mmBrokerOfCredit, PartyTypeCode.mmCorrespondentClearingFirm, PartyTypeCode.mmContraFirm, PartyTypeCode.mmContraClearingFirm, PartyTypeCode.mmUnderlyingContraFirm, PartyTypeCode.mmGiveUpClearingFirm,
						PartyTypeCode.mmOrderOriginationFirm, PartyTypeCode.mmSponsoringFirm, PartyTypeCode.mmClearingfirm, PartyTypeCode.mmIntroducingFirm, PartyTypeCode.mmEnteringFirm, PartyTypeCode.mmClient,
						PartyTypeCode.mmStepInBroker, PartyTypeCode.mmAffirmingParty, PartyTypeCode.mmETCServiceProvider1, PartyTypeCode.mmETCServiceProvider2, PartyTypeCode.mmRequestedBroker, PartyTypeCode.mmTaxAuthority,
						PartyTypeCode.mmDelegateIssuer, PartyTypeCode.mmOriginatingPOI, PartyTypeCode.mmCardIssuer, PartyTypeCode.mmAcceptor, PartyTypeCode.mmMerchant, PartyTypeCode.mmAcquirer, PartyTypeCode.mmIntermediaryAgent,
						PartyTypeCode.mmMasterTerminalManager, PartyTypeCode.mmTerminalManager, PartyTypeCode.mmAcquirerProcessor, PartyTypeCode.mmCardIssuerProcessor, PartyTypeCode.mmCardScheme, PartyTypeCode.mmCardSchemeProcessor,
						PartyTypeCode.mmATMManager, PartyTypeCode.mmHostingEntity, PartyTypeCode.mmOriginatingATM, PartyTypeCode.mmOriginatingTerminal, PartyTypeCode.mmCardApplication, PartyTypeCode.mmPOISystem, PartyTypeCode.mmPOIGroup,
						PartyTypeCode.mmSinglePOI, PartyTypeCode.mmAccountFromBank, PartyTypeCode.mmAccountToBank);
				derivation_lazy = () -> Arrays.asList(PartyType3Code.mmObject(), PartyType4Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}