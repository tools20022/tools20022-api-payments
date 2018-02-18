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
import com.tools20022.repository.codeset.ChequeDelivery1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method to be used in delivering a cheque to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#MailToDebtor
 * ChequeDelivery1Code.MailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#MailToCreditor
 * ChequeDelivery1Code.MailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#MailToFinalAgent
 * ChequeDelivery1Code.MailToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#CourierToDebtor
 * ChequeDelivery1Code.CourierToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#CourierToCreditor
 * ChequeDelivery1Code.CourierToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#CourierToFinalAgent
 * ChequeDelivery1Code.CourierToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#PickUpByDebtor
 * ChequeDelivery1Code.PickUpByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#PickUpByCreditor
 * ChequeDelivery1Code.PickUpByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#PickUpByFinalAgent
 * ChequeDelivery1Code.PickUpByFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#RegisteredMailToDebtor
 * ChequeDelivery1Code.RegisteredMailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#RegisteredMailToCreditor
 * ChequeDelivery1Code.RegisteredMailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#RegisteredMailToFinalAgent
 * ChequeDelivery1Code.RegisteredMailToFinalAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
 * ChequeDeliveryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MLDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChequeDelivery1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method to be used in delivering a cheque to a party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChequeDelivery1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToDebtor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code MailToDebtor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.MailToDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToCreditor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code MailToCreditor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.MailToCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code MailToFinalAgent = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.MailToFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToDebtor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code CourierToDebtor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.CourierToDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToCreditor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code CourierToCreditor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.CourierToCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code CourierToFinalAgent = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.CourierToFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByDebtor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code PickUpByDebtor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.PickUpByDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByCreditor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code PickUpByCreditor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.PickUpByCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code PickUpByFinalAgent = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.PickUpByFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToDebtor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code RegisteredMailToDebtor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.RegisteredMailToDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToCreditor"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code RegisteredMailToCreditor = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.RegisteredMailToCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery1Code RegisteredMailToFinalAgent = new ChequeDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery1Code.mmObject();
			codeName = ChequeDeliveryCode.RegisteredMailToFinalAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChequeDelivery1Code> codesByName = new LinkedHashMap<>();

	protected ChequeDelivery1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MLDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChequeDelivery1Code";
				definition = "Specifies the method to be used in delivering a cheque to a party.";
				trace_lazy = () -> ChequeDeliveryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeDelivery1Code.MailToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.MailToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.MailToFinalAgent, com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToFinalAgent, com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByDebtor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByCreditor, com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByFinalAgent,
						com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToFinalAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MailToDebtor.getCodeName().get(), MailToDebtor);
		codesByName.put(MailToCreditor.getCodeName().get(), MailToCreditor);
		codesByName.put(MailToFinalAgent.getCodeName().get(), MailToFinalAgent);
		codesByName.put(CourierToDebtor.getCodeName().get(), CourierToDebtor);
		codesByName.put(CourierToCreditor.getCodeName().get(), CourierToCreditor);
		codesByName.put(CourierToFinalAgent.getCodeName().get(), CourierToFinalAgent);
		codesByName.put(PickUpByDebtor.getCodeName().get(), PickUpByDebtor);
		codesByName.put(PickUpByCreditor.getCodeName().get(), PickUpByCreditor);
		codesByName.put(PickUpByFinalAgent.getCodeName().get(), PickUpByFinalAgent);
		codesByName.put(RegisteredMailToDebtor.getCodeName().get(), RegisteredMailToDebtor);
		codesByName.put(RegisteredMailToCreditor.getCodeName().get(), RegisteredMailToCreditor);
		codesByName.put(RegisteredMailToFinalAgent.getCodeName().get(), RegisteredMailToFinalAgent);
	}

	public static ChequeDelivery1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChequeDelivery1Code[] values() {
		ChequeDelivery1Code[] values = new ChequeDelivery1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChequeDelivery1Code> {
		@Override
		public ChequeDelivery1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChequeDelivery1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}