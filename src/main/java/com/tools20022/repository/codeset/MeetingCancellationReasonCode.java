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
import com.tools20022.repository.codeset.MeetingCancellationReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for cancelling a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode#Quorum
 * MeetingCancellationReasonCode.Quorum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode#Processing
 * MeetingCancellationReasonCode.Processing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode#Other
 * MeetingCancellationReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode#Withdrawal
 * MeetingCancellationReasonCode.Withdrawal}</li>
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
 * <li>"QORM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for cancelling a meeting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingCancellationReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation due to insufficient participation to the vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode
	 * MeetingCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QORM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quorum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation due to insufficient participation to the vote."</li>
	 * </ul>
	 */
	public static final MeetingCancellationReasonCode Quorum = new MeetingCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quorum";
			definition = "Cancellation due to insufficient participation to the vote.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingCancellationReasonCode.mmObject();
			codeName = "QORM";
		}
	};
	/**
	 * Cancellation due to a processing error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode
	 * MeetingCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation due to a processing error."</li>
	 * </ul>
	 */
	public static final MeetingCancellationReasonCode Processing = new MeetingCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processing";
			definition = "Cancellation due to a processing error.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingCancellationReasonCode.mmObject();
			codeName = "PROC";
		}
	};
	/**
	 * Cancellation due to another reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode
	 * MeetingCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation due to another reason."</li>
	 * </ul>
	 */
	public static final MeetingCancellationReasonCode Other = new MeetingCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Cancellation due to another reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingCancellationReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Cancellation due to the meeting being cancelled by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode
	 * MeetingCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation due to the meeting being cancelled by the issuer."</li>
	 * </ul>
	 */
	public static final MeetingCancellationReasonCode Withdrawal = new MeetingCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Cancellation due to the meeting being cancelled by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingCancellationReasonCode.mmObject();
			codeName = "WITH";
		}
	};
	final static private LinkedHashMap<String, MeetingCancellationReasonCode> codesByName = new LinkedHashMap<>();

	protected MeetingCancellationReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("QORM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingCancellationReasonCode";
				definition = "Specifies the reason for cancelling a meeting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingCancellationReasonCode.Quorum, com.tools20022.repository.codeset.MeetingCancellationReasonCode.Processing,
						com.tools20022.repository.codeset.MeetingCancellationReasonCode.Other, com.tools20022.repository.codeset.MeetingCancellationReasonCode.Withdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Quorum.getCodeName().get(), Quorum);
		codesByName.put(Processing.getCodeName().get(), Processing);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
	}

	public static MeetingCancellationReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingCancellationReasonCode[] values() {
		MeetingCancellationReasonCode[] values = new MeetingCancellationReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingCancellationReasonCode> {
		@Override
		public MeetingCancellationReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingCancellationReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}