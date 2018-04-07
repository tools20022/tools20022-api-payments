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
import com.tools20022.repository.codeset.DeliveryPlaceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the place of delivery.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode#Employer
 * DeliveryPlaceCode.Employer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode#Individual
 * DeliveryPlaceCode.Individual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode#EntranceOfMeeting
 * DeliveryPlaceCode.EntranceOfMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode#OtherAddress
 * DeliveryPlaceCode.OtherAddress}</li>
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
 * <li>"EMPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryPlaceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the place of delivery."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryPlaceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card needs to be mailed to employers address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode
	 * DeliveryPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Employer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card needs to be mailed to employers address."</li>
	 * </ul>
	 */
	public static final DeliveryPlaceCode Employer = new DeliveryPlaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Employer";
			definition = "Card needs to be mailed to employers address.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlaceCode.mmObject();
			codeName = "EMPL";
		}
	};
	/**
	 * Card needs to be mailed to individual specified in PersonDetail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode
	 * DeliveryPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card needs to be mailed to individual specified in PersonDetail."</li>
	 * </ul>
	 */
	public static final DeliveryPlaceCode Individual = new DeliveryPlaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Individual";
			definition = "Card needs to be mailed to individual specified in PersonDetail.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlaceCode.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Card needs to be available at the entrance of the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode
	 * DeliveryPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntranceOfMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card needs to be available at the entrance of the meeting."</li>
	 * </ul>
	 */
	public static final DeliveryPlaceCode EntranceOfMeeting = new DeliveryPlaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntranceOfMeeting";
			definition = "Card needs to be available at the entrance of the meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlaceCode.mmObject();
			codeName = "ENTR";
		}
	};
	/**
	 * Cards needs to be send to other specified address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode
	 * DeliveryPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cards needs to be send to other specified address."</li>
	 * </ul>
	 */
	public static final DeliveryPlaceCode OtherAddress = new DeliveryPlaceCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherAddress";
			definition = "Cards needs to be send to other specified address.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlaceCode.mmObject();
			codeName = "OADR";
		}
	};
	final static private LinkedHashMap<String, DeliveryPlaceCode> codesByName = new LinkedHashMap<>();

	protected DeliveryPlaceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EMPL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryPlaceCode";
				definition = "Specifies the place of delivery.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryPlaceCode.Employer, com.tools20022.repository.codeset.DeliveryPlaceCode.Individual,
						com.tools20022.repository.codeset.DeliveryPlaceCode.EntranceOfMeeting, com.tools20022.repository.codeset.DeliveryPlaceCode.OtherAddress);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Employer.getCodeName().get(), Employer);
		codesByName.put(Individual.getCodeName().get(), Individual);
		codesByName.put(EntranceOfMeeting.getCodeName().get(), EntranceOfMeeting);
		codesByName.put(OtherAddress.getCodeName().get(), OtherAddress);
	}

	public static DeliveryPlaceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryPlaceCode[] values() {
		DeliveryPlaceCode[] values = new DeliveryPlaceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryPlaceCode> {
		@Override
		public DeliveryPlaceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryPlaceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}