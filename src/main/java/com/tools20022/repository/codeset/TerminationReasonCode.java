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
import com.tools20022.repository.codeset.TerminationReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the termination reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode#UnderlyingBusinessFinished
 * TerminationReasonCode.UnderlyingBusinessFinished}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode#WarrantyObligationPeriodExpired
 * TerminationReasonCode.WarrantyObligationPeriodExpired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode#TenderNonAcceptance
 * TerminationReasonCode.TenderNonAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode#ReductionTermsFulfilled
 * TerminationReasonCode.ReductionTermsFulfilled}</li>
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
 * <li>"BUFI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the termination reason."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminationReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for termination is underlying business has finished.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode
	 * TerminationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingBusinessFinished"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for termination is underlying business has finished."</li>
	 * </ul>
	 */
	public static final TerminationReasonCode UnderlyingBusinessFinished = new TerminationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingBusinessFinished";
			definition = "Reason for termination is underlying business has finished.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReasonCode.mmObject();
			codeName = "BUFI";
		}
	};
	/**
	 * Reason for termination is warranty obligation period has expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode
	 * TerminationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WOEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantyObligationPeriodExpired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for termination is warranty obligation period has expired."</li>
	 * </ul>
	 */
	public static final TerminationReasonCode WarrantyObligationPeriodExpired = new TerminationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantyObligationPeriodExpired";
			definition = "Reason for termination is warranty obligation period has expired.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReasonCode.mmObject();
			codeName = "WOEX";
		}
	};
	/**
	 * Reason for termination is non-acceptance of a tender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode
	 * TerminationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderNonAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for termination is non-acceptance of a tender."</li>
	 * </ul>
	 */
	public static final TerminationReasonCode TenderNonAcceptance = new TerminationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderNonAcceptance";
			definition = "Reason for termination is non-acceptance of a tender.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReasonCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Reason for termination is reduction terms have been fulfilled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode
	 * TerminationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReductionTermsFulfilled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for termination is reduction terms have been fulfilled."</li>
	 * </ul>
	 */
	public static final TerminationReasonCode ReductionTermsFulfilled = new TerminationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReductionTermsFulfilled";
			definition = "Reason for termination is reduction terms have been fulfilled.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReasonCode.mmObject();
			codeName = "REFU";
		}
	};
	final static private LinkedHashMap<String, TerminationReasonCode> codesByName = new LinkedHashMap<>();

	protected TerminationReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUFI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminationReasonCode";
				definition = "Specifies the termination reason.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminationReasonCode.UnderlyingBusinessFinished, com.tools20022.repository.codeset.TerminationReasonCode.WarrantyObligationPeriodExpired,
						com.tools20022.repository.codeset.TerminationReasonCode.TenderNonAcceptance, com.tools20022.repository.codeset.TerminationReasonCode.ReductionTermsFulfilled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnderlyingBusinessFinished.getCodeName().get(), UnderlyingBusinessFinished);
		codesByName.put(WarrantyObligationPeriodExpired.getCodeName().get(), WarrantyObligationPeriodExpired);
		codesByName.put(TenderNonAcceptance.getCodeName().get(), TenderNonAcceptance);
		codesByName.put(ReductionTermsFulfilled.getCodeName().get(), ReductionTermsFulfilled);
	}

	public static TerminationReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminationReasonCode[] values() {
		TerminationReasonCode[] values = new TerminationReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminationReasonCode> {
		@Override
		public TerminationReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminationReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}