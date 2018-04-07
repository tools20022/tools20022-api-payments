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
import com.tools20022.repository.codeset.TradeStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a trade in a central matching and settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Validated
 * TradeStatusCode.Validated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#RegulatoryChecked
 * TradeStatusCode.RegulatoryChecked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Invalid
 * TradeStatusCode.Invalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#SettlementRejected
 * TradeStatusCode.SettlementRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#RegulatorySuspended
 * TradeStatusCode.RegulatorySuspended}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Unmatched
 * TradeStatusCode.Unmatched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Matched
 * TradeStatusCode.Matched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Rescinded
 * TradeStatusCode.Rescinded}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Settled
 * TradeStatusCode.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#PartiallySettled
 * TradeStatusCode.PartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#MatchedValued
 * TradeStatusCode.MatchedValued}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Rejected
 * TradeStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#OptionMature
 * TradeStatusCode.OptionMature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#SettlementMemberAuthorised
 * TradeStatusCode.SettlementMemberAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#SettlementMemberNotAuthorised
 * TradeStatusCode.SettlementMemberNotAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#SettlementMature
 * TradeStatusCode.SettlementMature}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Split
 * TradeStatusCode.Split}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Suspended
 * TradeStatusCode.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#NotAuthorised
 * TradeStatusCode.NotAuthorised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Amended
 * TradeStatusCode.Amended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#SettlementMaturePending
 * TradeStatusCode.SettlementMaturePending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#Netted
 * TradeStatusCode.Netted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#OpenMatched
 * TradeStatusCode.OpenMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode#FixUnmatched
 * TradeStatusCode.FixUnmatched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatusCode#PartialFix
 * TradeStatusCode.PartialFix}</li>
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
 * <li>"VALI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a trade in a central matching and settlement system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade is validated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is validated."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Validated = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Validated";
			definition = "Trade is validated.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "VALI";
		}
	};
	/**
	 * Trade passed regulatory check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryChecked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade passed regulatory check."</li>
	 * </ul>
	 */
	public static final TradeStatusCode RegulatoryChecked = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryChecked";
			definition = "Trade passed regulatory check.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "REGC";
		}
	};
	/**
	 * Trade is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is invalid."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Invalid = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			definition = "Trade is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "INVA";
		}
	};
	/**
	 * Trade settlement is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRJC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade settlement is rejected."</li>
	 * </ul>
	 */
	public static final TradeStatusCode SettlementRejected = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRejected";
			definition = "Trade settlement is rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "SRJC";
		}
	};
	/**
	 * Trade is suspended for regulatory reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatorySuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is suspended for regulatory reasons."</li>
	 * </ul>
	 */
	public static final TradeStatusCode RegulatorySuspended = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatorySuspended";
			definition = "Trade is suspended for regulatory reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "REGS";
		}
	};
	/**
	 * Trade is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is unmatched."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Unmatched = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Trade is unmatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "UMTC";
		}
	};
	/**
	 * Trade is matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is matched."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Matched = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			definition = "Trade is matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "FMTC";
		}
	};
	/**
	 * Trade is rescinded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is rescinded."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Rescinded = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			definition = "Trade is rescinded.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "RSCD";
		}
	};
	/**
	 * Settlement is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is complete."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Settled = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Settlement is complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Part, but not all, of a Trade's value has settled, and no further
	 * elements of the Trade's value are expected to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled."
	 * </li>
	 * </ul>
	 */
	public static final TradeStatusCode PartiallySettled = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "PSTL";
		}
	};
	/**
	 * Both the Opening and the Valuation details of an NDF trade have been
	 * matched with corresponding details of a counterparty's NDF trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedValued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Both the Opening and the Valuation details of an NDF trade have been matched with corresponding details of a counterparty's NDF trade."
	 * </li>
	 * </ul>
	 */
	public static final TradeStatusCode MatchedValued = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedValued";
			definition = "Both the Opening and the Valuation details of an NDF trade have been matched with corresponding details of a counterparty's NDF trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "VMTC";
		}
	};
	/**
	 * Trade is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is rejected."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Rejected = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Trade is rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Option has matured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionMature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option has matured."</li>
	 * </ul>
	 */
	public static final TradeStatusCode OptionMature = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionMature";
			definition = "Option has matured.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "OPMA";
		}
	};
	/**
	 * Trade has been authorised by the settlement member guaranteeing payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMemberAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade has been authorised by the settlement member guaranteeing payment."
	 * </li>
	 * </ul>
	 */
	public static final TradeStatusCode SettlementMemberAuthorised = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberAuthorised";
			definition = "Trade has been authorised by the settlement member guaranteeing payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "SMAU";
		}
	};
	/**
	 * Trade has not been authorised by the settlement member guaranteeing
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMemberNotAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade has not been authorised by the settlement member guaranteeing payment."
	 * </li>
	 * </ul>
	 */
	public static final TradeStatusCode SettlementMemberNotAuthorised = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberNotAuthorised";
			definition = "Trade has not been authorised by the settlement member guaranteeing payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "SMNA";
		}
	};
	/**
	 * Trade has been selected for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade has been selected for settlement."</li>
	 * </ul>
	 */
	public static final TradeStatusCode SettlementMature = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			definition = "Trade has been selected for settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "SMAT";
		}
	};
	/**
	 * Trade has been split into subtrades for settlement efficiency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade has been split into subtrades for settlement efficiency."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Split = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Split";
			definition = "Trade has been split into subtrades for settlement efficiency.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "SPLI";
		}
	};
	/**
	 * Trade has been marked not ready for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade has been marked not ready for settlement."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Suspended = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Trade has been marked not ready for settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Trade is not authorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is not authorised."</li>
	 * </ul>
	 */
	public static final TradeStatusCode NotAuthorised = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			definition = "Trade is not authorised.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * Trade is amended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMUI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is amended."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Amended = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amended";
			definition = "Trade is amended.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "AMUI";
		}
	};
	/**
	 * Trade has been selected for settlement and is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMaturePending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade has been selected for settlement and is pending."</li>
	 * </ul>
	 */
	public static final TradeStatusCode SettlementMaturePending = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMaturePending";
			definition = "Trade has been selected for settlement and is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "SMAP";
		}
	};
	/**
	 * Trade has been netted by the central system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade has been netted by the central system."</li>
	 * </ul>
	 */
	public static final TradeStatusCode Netted = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netted";
			definition = "Trade has been netted by the central system.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * For NDF trades, the trade is marked as open match when both open
	 * confirmations from both parties match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For NDF trades, the trade is marked as open match when both open confirmations from both parties match."
	 * </li>
	 * </ul>
	 */
	public static final TradeStatusCode OpenMatched = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenMatched";
			definition = "For NDF trades, the trade is marked as open match when both open confirmations from both parties match.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "OMTC";
		}
	};
	/**
	 * For NDF instructions, if a party has submitted both the open and fix
	 * confirmations and the counterparty is yet to submit the open and fix
	 * confirmation the instruction is updated to ‘Fix Unmatched’ Status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixUnmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For NDF instructions, if a party has submitted both the open and fix confirmations and the counterparty is yet to submit the open and fix confirmation the instruction is updated to ‘Fix Unmatched’ Status."
	 * </li>
	 * </ul>
	 */
	public static final TradeStatusCode FixUnmatched = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixUnmatched";
			definition = "For NDF instructions, if a party has submitted both the open and fix confirmations and the counterparty is yet to submit the open and fix confirmation the instruction is updated to ‘Fix Unmatched’ Status.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "FUMT";
		}
	};
	/**
	 * For NDF instructions, open confirmations are matched and the Fix
	 * confirmations are not matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialFix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For NDF instructions, open confirmations are matched and the Fix confirmations are not matched."
	 * </li>
	 * </ul>
	 */
	public static final TradeStatusCode PartialFix = new TradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFix";
			definition = "For NDF instructions, open confirmations are matched and the Fix confirmations are not matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatusCode.mmObject();
			codeName = "PFIX";
		}
	};
	final static private LinkedHashMap<String, TradeStatusCode> codesByName = new LinkedHashMap<>();

	protected TradeStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("VALI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeStatusCode";
				definition = "Specifies the status of a trade in a central matching and settlement system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeStatusCode.Validated, com.tools20022.repository.codeset.TradeStatusCode.RegulatoryChecked, com.tools20022.repository.codeset.TradeStatusCode.Invalid,
						com.tools20022.repository.codeset.TradeStatusCode.SettlementRejected, com.tools20022.repository.codeset.TradeStatusCode.RegulatorySuspended, com.tools20022.repository.codeset.TradeStatusCode.Unmatched,
						com.tools20022.repository.codeset.TradeStatusCode.Matched, com.tools20022.repository.codeset.TradeStatusCode.Rescinded, com.tools20022.repository.codeset.TradeStatusCode.Settled,
						com.tools20022.repository.codeset.TradeStatusCode.PartiallySettled, com.tools20022.repository.codeset.TradeStatusCode.MatchedValued, com.tools20022.repository.codeset.TradeStatusCode.Rejected,
						com.tools20022.repository.codeset.TradeStatusCode.OptionMature, com.tools20022.repository.codeset.TradeStatusCode.SettlementMemberAuthorised,
						com.tools20022.repository.codeset.TradeStatusCode.SettlementMemberNotAuthorised, com.tools20022.repository.codeset.TradeStatusCode.SettlementMature, com.tools20022.repository.codeset.TradeStatusCode.Split,
						com.tools20022.repository.codeset.TradeStatusCode.Suspended, com.tools20022.repository.codeset.TradeStatusCode.NotAuthorised, com.tools20022.repository.codeset.TradeStatusCode.Amended,
						com.tools20022.repository.codeset.TradeStatusCode.SettlementMaturePending, com.tools20022.repository.codeset.TradeStatusCode.Netted, com.tools20022.repository.codeset.TradeStatusCode.OpenMatched,
						com.tools20022.repository.codeset.TradeStatusCode.FixUnmatched, com.tools20022.repository.codeset.TradeStatusCode.PartialFix);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Validated.getCodeName().get(), Validated);
		codesByName.put(RegulatoryChecked.getCodeName().get(), RegulatoryChecked);
		codesByName.put(Invalid.getCodeName().get(), Invalid);
		codesByName.put(SettlementRejected.getCodeName().get(), SettlementRejected);
		codesByName.put(RegulatorySuspended.getCodeName().get(), RegulatorySuspended);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Rescinded.getCodeName().get(), Rescinded);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(PartiallySettled.getCodeName().get(), PartiallySettled);
		codesByName.put(MatchedValued.getCodeName().get(), MatchedValued);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(OptionMature.getCodeName().get(), OptionMature);
		codesByName.put(SettlementMemberAuthorised.getCodeName().get(), SettlementMemberAuthorised);
		codesByName.put(SettlementMemberNotAuthorised.getCodeName().get(), SettlementMemberNotAuthorised);
		codesByName.put(SettlementMature.getCodeName().get(), SettlementMature);
		codesByName.put(Split.getCodeName().get(), Split);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(NotAuthorised.getCodeName().get(), NotAuthorised);
		codesByName.put(Amended.getCodeName().get(), Amended);
		codesByName.put(SettlementMaturePending.getCodeName().get(), SettlementMaturePending);
		codesByName.put(Netted.getCodeName().get(), Netted);
		codesByName.put(OpenMatched.getCodeName().get(), OpenMatched);
		codesByName.put(FixUnmatched.getCodeName().get(), FixUnmatched);
		codesByName.put(PartialFix.getCodeName().get(), PartialFix);
	}

	public static TradeStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeStatusCode[] values() {
		TradeStatusCode[] values = new TradeStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeStatusCode> {
		@Override
		public TradeStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}