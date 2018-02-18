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
import com.tools20022.repository.codeset.PartyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the entitled party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#SaleSystem
 * PartyTypeCode.SaleSystem}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#POIComponent
 * PartyTypeCode.POIComponent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Issuer
 * PartyTypeCode.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Holder
 * PartyTypeCode.Holder}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Investor
 * PartyTypeCode.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ExecutingFirm
 * PartyTypeCode.ExecutingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#BrokerOfCredit
 * PartyTypeCode.BrokerOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CorrespondentClearingFirm
 * PartyTypeCode.CorrespondentClearingFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#ContraFirm
 * PartyTypeCode.ContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ContraClearingFirm
 * PartyTypeCode.ContraClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#UnderlyingContraFirm
 * PartyTypeCode.UnderlyingContraFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#GiveUpClearingFirm
 * PartyTypeCode.GiveUpClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#OrderOriginationFirm
 * PartyTypeCode.OrderOriginationFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#SponsoringFirm
 * PartyTypeCode.SponsoringFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Clearingfirm
 * PartyTypeCode.Clearingfirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#IntroducingFirm
 * PartyTypeCode.IntroducingFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#EnteringFirm
 * PartyTypeCode.EnteringFirm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Client
 * PartyTypeCode.Client}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#StepInBroker
 * PartyTypeCode.StepInBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#AffirmingParty
 * PartyTypeCode.AffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ETCServiceProvider1
 * PartyTypeCode.ETCServiceProvider1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#ETCServiceProvider2
 * PartyTypeCode.ETCServiceProvider2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#RequestedBroker
 * PartyTypeCode.RequestedBroker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#TaxAuthority
 * PartyTypeCode.TaxAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#DelegateIssuer
 * PartyTypeCode.DelegateIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#OriginatingPOI
 * PartyTypeCode.OriginatingPOI}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#CardIssuer
 * PartyTypeCode.CardIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Acceptor
 * PartyTypeCode.Acceptor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Merchant
 * PartyTypeCode.Merchant}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#Acquirer
 * PartyTypeCode.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#IntermediaryAgent
 * PartyTypeCode.IntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#MasterTerminalManager
 * PartyTypeCode.MasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#TerminalManager
 * PartyTypeCode.TerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#AcquirerProcessor
 * PartyTypeCode.AcquirerProcessor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CardIssuerProcessor
 * PartyTypeCode.CardIssuerProcessor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#CardScheme
 * PartyTypeCode.CardScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CardSchemeProcessor
 * PartyTypeCode.CardSchemeProcessor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#ATMManager
 * PartyTypeCode.ATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#HostingEntity
 * PartyTypeCode.HostingEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#OriginatingATM
 * PartyTypeCode.OriginatingATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#OriginatingTerminal
 * PartyTypeCode.OriginatingTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#CardApplication
 * PartyTypeCode.CardApplication}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#POISystem
 * PartyTypeCode.POISystem}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#POIGroup
 * PartyTypeCode.POIGroup}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyTypeCode#SinglePOI
 * PartyTypeCode.SinglePOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#AccountFromBank
 * PartyTypeCode.AccountFromBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode#AccountToBank
 * PartyTypeCode.AccountToBank}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyTypeCode extends MMCode {

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
	public static final PartyTypeCode SaleSystem = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SaleSystem";
			definition = "Party selling goods and services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode POIComponent = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "POIComponent";
			definition = "Party component of a POI system or POI terminal (Point of Interaction).";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Issuer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuer";
			definition = "Issuer is the entitled party.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Holder = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Holder";
			definition = "Holder is the entitled party.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Investor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode ExecutingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingFirm";
			definition = "Party that identifies an executing / give-up broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode BrokerOfCredit = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			definition = "Party that receives the trade credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode CorrespondentClearingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentClearingFirm";
			definition = "Party that is going to carry the position on their books at another clearinghouse (exchanges).";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode ContraFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraFirm";
			definition = "Party that is the counterparty in a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode ContraClearingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraClearingFirm";
			definition = "Party that is the clearing firm of the counterparty in a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode UnderlyingContraFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingContraFirm";
			definition = "Party (broker or other firm), which is the contra side of the trade for the underlying security.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode GiveUpClearingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiveUpClearingFirm";
			definition = "Party to which the trade is given up (carries the position that results from a trade).";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode OrderOriginationFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginationFirm";
			definition = "Party that originates an order.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode SponsoringFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsoringFirm";
			definition = "Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Clearingfirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clearingfirm";
			definition = "Party (broker) that settles security transactions from another broker for a fee = take up broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode IntroducingFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			definition = "Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode EnteringFirm = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnteringFirm";
			definition = "Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Client = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "A client is identified in third party-transactions or for investor in intermediary transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode StepInBroker = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepInBroker";
			definition = "Broker to which the investment manager directs the execution of a portion of the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode AffirmingParty = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode ETCServiceProvider1 = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider1";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 1.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode ETCServiceProvider2 = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider2";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 2.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode RequestedBroker = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedBroker";
			definition = "In a directed order, broker with which the Receiver of the message is requested to execute the order.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode TaxAuthority = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAuthority";
			definition = "Tax authority.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode DelegateIssuer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DelegateIssuer";
			definition = "Party to whom the card issuer delegates to authorise card payment transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode OriginatingPOI = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginatingPOI";
			definition = "Point Of Interaction initiating the card payment transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode CardIssuer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardIssuer";
			definition = "Party that issues cards.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Acceptor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acceptor";
			definition = "Card acceptor, party accepting the card and presenting transaction data to the acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Merchant = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant providing goods and service in the card payment transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode Acquirer = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Acquirer";
			definition = "Entity acquiring card transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode IntermediaryAgent = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediaryAgent";
			definition = "Party acting on behalf of other parties to process or forward data to other parties.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode MasterTerminalManager = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterTerminalManager";
			definition = "Responsible for the maintenance of a card payment acceptance terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode TerminalManager = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManager";
			definition = "Responsible for one or several maintenance functions of a card payment acceptance terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode AcquirerProcessor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProcessor";
			definition = "Entity providing acquiring card payment processing services on behalf on an acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode CardIssuerProcessor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerProcessor";
			definition = "Entity providing issuing card payment processing services on behalf on an issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode CardScheme = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardScheme";
			definition = "Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode CardSchemeProcessor = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSchemeProcessor";
			definition = "Entity providing card payment processing services acting on behalf of a card scheme.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode ATMManager = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			definition = "Entity managing the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode HostingEntity = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode OriginatingATM = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingATM";
			definition = "ATM initiating the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode OriginatingTerminal = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingTerminal";
			definition = "Application on the terminal which has initiated the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode CardApplication = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			definition = "Application in the smart card.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode POISystem = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISystem";
			definition = "Configuration to apply to the whole POI system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode POIGroup = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIGroup";
			definition = "Configuration to apply to a subset of the whole POI system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode SinglePOI = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SinglePOI";
			definition = "Configuration to apply to a single POI terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode AccountFromBank = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFromBank";
			definition = "The bank of the source account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
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
	public static final PartyTypeCode AccountToBank = new PartyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountToBank";
			definition = "The bank of the destination account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyTypeCode.mmObject();
			codeName = "BKAT";
		}
	};
	final static private LinkedHashMap<String, PartyTypeCode> codesByName = new LinkedHashMap<>();

	protected PartyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ISUR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyTypeCode";
				definition = "Specifies the entitled party.";
				derivation_lazy = () -> Arrays.asList(PartyType3Code.mmObject(), PartyType4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyTypeCode.SaleSystem, com.tools20022.repository.codeset.PartyTypeCode.POIComponent, com.tools20022.repository.codeset.PartyTypeCode.Issuer,
						com.tools20022.repository.codeset.PartyTypeCode.Holder, com.tools20022.repository.codeset.PartyTypeCode.Investor, com.tools20022.repository.codeset.PartyTypeCode.ExecutingFirm,
						com.tools20022.repository.codeset.PartyTypeCode.BrokerOfCredit, com.tools20022.repository.codeset.PartyTypeCode.CorrespondentClearingFirm, com.tools20022.repository.codeset.PartyTypeCode.ContraFirm,
						com.tools20022.repository.codeset.PartyTypeCode.ContraClearingFirm, com.tools20022.repository.codeset.PartyTypeCode.UnderlyingContraFirm, com.tools20022.repository.codeset.PartyTypeCode.GiveUpClearingFirm,
						com.tools20022.repository.codeset.PartyTypeCode.OrderOriginationFirm, com.tools20022.repository.codeset.PartyTypeCode.SponsoringFirm, com.tools20022.repository.codeset.PartyTypeCode.Clearingfirm,
						com.tools20022.repository.codeset.PartyTypeCode.IntroducingFirm, com.tools20022.repository.codeset.PartyTypeCode.EnteringFirm, com.tools20022.repository.codeset.PartyTypeCode.Client,
						com.tools20022.repository.codeset.PartyTypeCode.StepInBroker, com.tools20022.repository.codeset.PartyTypeCode.AffirmingParty, com.tools20022.repository.codeset.PartyTypeCode.ETCServiceProvider1,
						com.tools20022.repository.codeset.PartyTypeCode.ETCServiceProvider2, com.tools20022.repository.codeset.PartyTypeCode.RequestedBroker, com.tools20022.repository.codeset.PartyTypeCode.TaxAuthority,
						com.tools20022.repository.codeset.PartyTypeCode.DelegateIssuer, com.tools20022.repository.codeset.PartyTypeCode.OriginatingPOI, com.tools20022.repository.codeset.PartyTypeCode.CardIssuer,
						com.tools20022.repository.codeset.PartyTypeCode.Acceptor, com.tools20022.repository.codeset.PartyTypeCode.Merchant, com.tools20022.repository.codeset.PartyTypeCode.Acquirer,
						com.tools20022.repository.codeset.PartyTypeCode.IntermediaryAgent, com.tools20022.repository.codeset.PartyTypeCode.MasterTerminalManager, com.tools20022.repository.codeset.PartyTypeCode.TerminalManager,
						com.tools20022.repository.codeset.PartyTypeCode.AcquirerProcessor, com.tools20022.repository.codeset.PartyTypeCode.CardIssuerProcessor, com.tools20022.repository.codeset.PartyTypeCode.CardScheme,
						com.tools20022.repository.codeset.PartyTypeCode.CardSchemeProcessor, com.tools20022.repository.codeset.PartyTypeCode.ATMManager, com.tools20022.repository.codeset.PartyTypeCode.HostingEntity,
						com.tools20022.repository.codeset.PartyTypeCode.OriginatingATM, com.tools20022.repository.codeset.PartyTypeCode.OriginatingTerminal, com.tools20022.repository.codeset.PartyTypeCode.CardApplication,
						com.tools20022.repository.codeset.PartyTypeCode.POISystem, com.tools20022.repository.codeset.PartyTypeCode.POIGroup, com.tools20022.repository.codeset.PartyTypeCode.SinglePOI,
						com.tools20022.repository.codeset.PartyTypeCode.AccountFromBank, com.tools20022.repository.codeset.PartyTypeCode.AccountToBank);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SaleSystem.getCodeName().get(), SaleSystem);
		codesByName.put(POIComponent.getCodeName().get(), POIComponent);
		codesByName.put(Issuer.getCodeName().get(), Issuer);
		codesByName.put(Holder.getCodeName().get(), Holder);
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(ExecutingFirm.getCodeName().get(), ExecutingFirm);
		codesByName.put(BrokerOfCredit.getCodeName().get(), BrokerOfCredit);
		codesByName.put(CorrespondentClearingFirm.getCodeName().get(), CorrespondentClearingFirm);
		codesByName.put(ContraFirm.getCodeName().get(), ContraFirm);
		codesByName.put(ContraClearingFirm.getCodeName().get(), ContraClearingFirm);
		codesByName.put(UnderlyingContraFirm.getCodeName().get(), UnderlyingContraFirm);
		codesByName.put(GiveUpClearingFirm.getCodeName().get(), GiveUpClearingFirm);
		codesByName.put(OrderOriginationFirm.getCodeName().get(), OrderOriginationFirm);
		codesByName.put(SponsoringFirm.getCodeName().get(), SponsoringFirm);
		codesByName.put(Clearingfirm.getCodeName().get(), Clearingfirm);
		codesByName.put(IntroducingFirm.getCodeName().get(), IntroducingFirm);
		codesByName.put(EnteringFirm.getCodeName().get(), EnteringFirm);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(StepInBroker.getCodeName().get(), StepInBroker);
		codesByName.put(AffirmingParty.getCodeName().get(), AffirmingParty);
		codesByName.put(ETCServiceProvider1.getCodeName().get(), ETCServiceProvider1);
		codesByName.put(ETCServiceProvider2.getCodeName().get(), ETCServiceProvider2);
		codesByName.put(RequestedBroker.getCodeName().get(), RequestedBroker);
		codesByName.put(TaxAuthority.getCodeName().get(), TaxAuthority);
		codesByName.put(DelegateIssuer.getCodeName().get(), DelegateIssuer);
		codesByName.put(OriginatingPOI.getCodeName().get(), OriginatingPOI);
		codesByName.put(CardIssuer.getCodeName().get(), CardIssuer);
		codesByName.put(Acceptor.getCodeName().get(), Acceptor);
		codesByName.put(Merchant.getCodeName().get(), Merchant);
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(IntermediaryAgent.getCodeName().get(), IntermediaryAgent);
		codesByName.put(MasterTerminalManager.getCodeName().get(), MasterTerminalManager);
		codesByName.put(TerminalManager.getCodeName().get(), TerminalManager);
		codesByName.put(AcquirerProcessor.getCodeName().get(), AcquirerProcessor);
		codesByName.put(CardIssuerProcessor.getCodeName().get(), CardIssuerProcessor);
		codesByName.put(CardScheme.getCodeName().get(), CardScheme);
		codesByName.put(CardSchemeProcessor.getCodeName().get(), CardSchemeProcessor);
		codesByName.put(ATMManager.getCodeName().get(), ATMManager);
		codesByName.put(HostingEntity.getCodeName().get(), HostingEntity);
		codesByName.put(OriginatingATM.getCodeName().get(), OriginatingATM);
		codesByName.put(OriginatingTerminal.getCodeName().get(), OriginatingTerminal);
		codesByName.put(CardApplication.getCodeName().get(), CardApplication);
		codesByName.put(POISystem.getCodeName().get(), POISystem);
		codesByName.put(POIGroup.getCodeName().get(), POIGroup);
		codesByName.put(SinglePOI.getCodeName().get(), SinglePOI);
		codesByName.put(AccountFromBank.getCodeName().get(), AccountFromBank);
		codesByName.put(AccountToBank.getCodeName().get(), AccountToBank);
	}

	public static PartyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyTypeCode[] values() {
		PartyTypeCode[] values = new PartyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyTypeCode> {
		@Override
		public PartyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}