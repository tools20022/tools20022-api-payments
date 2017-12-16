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
import com.tools20022.repository.codeset.CorporateActionEventStageCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the stage of the CA event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#Approved
 * CorporateActionEventStageCode.mmApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#Deactivated
 * CorporateActionEventStageCode.mmDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#FullReversalLotteryNotification
 * CorporateActionEventStageCode.mmFullReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#Lapsed
 * CorporateActionEventStageCode.mmLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#PartialReversalLotteryNotification
 * CorporateActionEventStageCode.mmPartialReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#ActionPeriod
 * CorporateActionEventStageCode.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#RescissionReversalLotteryNotification
 * CorporateActionEventStageCode.mmRescissionReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#SubjectToApproval
 * CorporateActionEventStageCode.mmSubjectToApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#UnconditionalAsToAcceptance
 * CorporateActionEventStageCode.mmUnconditionalAsToAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode#WhollyUnconditional
 * CorporateActionEventStageCode.mmWhollyUnconditional}</li>
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
 * <li>"APPD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventStageCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage of the CA event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStageCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Approved at the relevant meeting, eg, dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Approved at the relevant meeting, eg, dividend."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode Approved = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Approved";
			definition = "Approved at the relevant meeting, eg, dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "APPD";
		}
	};
	/**
	 * The offer is closed for acceptance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The offer is closed for acceptance."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode Deactivated = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deactivated";
			definition = "The offer is closed for acceptance.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "CLDE";
		}
	};
	/**
	 * An original or supplemental lottery is being reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullReversalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An original or supplemental lottery is being reversed."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode FullReversalLotteryNotification = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullReversalLotteryNotification";
			definition = "An original or supplemental lottery is being reversed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * The event/offer conditions have not been met and the event/offer is
	 * terminated or lapsed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The event/offer conditions have not been met and the event/offer is terminated or lapsed."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode Lapsed = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lapsed";
			definition = "The event/offer conditions have not been met and the event/offer is terminated or lapsed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "LAPS";
		}
	};
	/**
	 * Original call amount is reduced by the agent. The original announcement
	 * is cancelled and a new original lottery is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReversalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original call amount is reduced by the agent. The original announcement is cancelled and a new original lottery is issued."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode PartialReversalLotteryNotification = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialReversalLotteryNotification";
			definition = "Original call amount is reduced by the agent. The original announcement is cancelled and a new original lottery is issued.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Open for acceptance until the next specified deadline in the announcement
	 * (if any).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PWAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Open for acceptance until the next specified deadline in the announcement (if any)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode ActionPeriod = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Open for acceptance until the next specified deadline in the announcement (if any).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "PWAL";
		}
	};
	/**
	 * Original and or supplemental lottery details have changed and the lottery
	 * is being cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RescissionReversalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original and or supplemental lottery details have changed and the lottery is being cancelled."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode RescissionReversalLotteryNotification = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RescissionReversalLotteryNotification";
			definition = "Original and or supplemental lottery details have changed and the lottery is being cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * Subject to approval at the relevant meeting, eg, dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subject to approval at the relevant meeting, eg, dividend."</li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode SubjectToApproval = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubjectToApproval";
			definition = "Subject to approval at the relevant meeting, eg, dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "SUAP";
		}
	};
	/**
	 * The required level of acceptances specified in the terms of the offer has
	 * been achieved but there are still outstanding conditions to fulfil.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalAsToAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode UnconditionalAsToAcceptance = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnconditionalAsToAcceptance";
			definition = "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "UNAC";
		}
	};
	/**
	 * Wholly unconditional; all conditions specified in the offer document have
	 * been satisfied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wholly unconditional; all conditions specified in the offer document have been satisfied."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventStageCode WhollyUnconditional = new CorporateActionEventStageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditional";
			definition = "Wholly unconditional; all conditions specified in the offer document have been satisfied.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStageCode.mmObject();
			codeName = "WHOU";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStageCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStageCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("APPD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStageCode";
				definition = "Specifies the stage of the CA event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStageCode.Approved, com.tools20022.repository.codeset.CorporateActionEventStageCode.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.FullReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.Lapsed,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.PartialReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.ActionPeriod,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.RescissionReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.SubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.UnconditionalAsToAcceptance, com.tools20022.repository.codeset.CorporateActionEventStageCode.WhollyUnconditional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
		codesByName.put(FullReversalLotteryNotification.getCodeName().get(), FullReversalLotteryNotification);
		codesByName.put(Lapsed.getCodeName().get(), Lapsed);
		codesByName.put(PartialReversalLotteryNotification.getCodeName().get(), PartialReversalLotteryNotification);
		codesByName.put(ActionPeriod.getCodeName().get(), ActionPeriod);
		codesByName.put(RescissionReversalLotteryNotification.getCodeName().get(), RescissionReversalLotteryNotification);
		codesByName.put(SubjectToApproval.getCodeName().get(), SubjectToApproval);
		codesByName.put(UnconditionalAsToAcceptance.getCodeName().get(), UnconditionalAsToAcceptance);
		codesByName.put(WhollyUnconditional.getCodeName().get(), WhollyUnconditional);
	}

	public static CorporateActionEventStageCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStageCode[] values() {
		CorporateActionEventStageCode[] values = new CorporateActionEventStageCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStageCode> {
		@Override
		public CorporateActionEventStageCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStageCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}