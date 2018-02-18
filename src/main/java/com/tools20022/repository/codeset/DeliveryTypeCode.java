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
import com.tools20022.repository.codeset.DeliveryTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the delivery or custody arrangement for the underlying securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode#AgainstPayment
 * DeliveryTypeCode.AgainstPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliveryTypeCode#Free
 * DeliveryTypeCode.Free}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliveryTypeCode#Triparty
 * DeliveryTypeCode.Triparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode#HoldInCustody
 * DeliveryTypeCode.HoldInCustody}</li>
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
 * <li>"AGPM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the delivery or custody arrangement for the underlying securities."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the delivery is against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode
	 * DeliveryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the delivery is against payment."</li>
	 * </ul>
	 */
	public static final DeliveryTypeCode AgainstPayment = new DeliveryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstPayment";
			definition = "Indicates that the delivery is against payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeCode.mmObject();
			codeName = "AGPM";
		}
	};
	/**
	 * Indicates the delivery is free of payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode
	 * DeliveryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Free"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the delivery is free of payment."</li>
	 * </ul>
	 */
	public static final DeliveryTypeCode Free = new DeliveryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Free";
			definition = "Indicates the delivery is free of payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeCode.mmObject();
			codeName = "FREE";
		}
	};
	/**
	 * Indicates that a custodian bank or international clearing organization
	 * acts as an intermediary between the two parties to the repo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode
	 * DeliveryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Triparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a custodian bank or international clearing organization acts as an intermediary between the two parties to the repo."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryTypeCode Triparty = new DeliveryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Triparty";
			definition = "Indicates that a custodian bank or international clearing organization acts as an intermediary between the two parties to the repo.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeCode.mmObject();
			codeName = "TRIP";
		}
	};
	/**
	 * Indicates that the collateral pledged by the (cash) borrower is not
	 * actually delivered to the cash lender. Rather, it is placed in an
	 * internal account ("held in custody") by the borrower, for the lender,
	 * throughout the duration of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode
	 * DeliveryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldInCustody"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the collateral pledged by the (cash) borrower is not actually delivered to the cash lender. Rather, it is placed in an internal account (\"held in custody\") by the borrower, for the lender, throughout the duration of the trade."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryTypeCode HoldInCustody = new DeliveryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldInCustody";
			definition = "Indicates that the collateral pledged by the (cash) borrower is not actually delivered to the cash lender. Rather, it is placed in an internal account (\"held in custody\") by the borrower, for the lender, throughout the duration of the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeCode.mmObject();
			codeName = "HOIC";
		}
	};
	final static private LinkedHashMap<String, DeliveryTypeCode> codesByName = new LinkedHashMap<>();

	protected DeliveryTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGPM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryTypeCode";
				definition = "Describes the delivery or custody arrangement for the underlying securities.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryTypeCode.AgainstPayment, com.tools20022.repository.codeset.DeliveryTypeCode.Free, com.tools20022.repository.codeset.DeliveryTypeCode.Triparty,
						com.tools20022.repository.codeset.DeliveryTypeCode.HoldInCustody);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AgainstPayment.getCodeName().get(), AgainstPayment);
		codesByName.put(Free.getCodeName().get(), Free);
		codesByName.put(Triparty.getCodeName().get(), Triparty);
		codesByName.put(HoldInCustody.getCodeName().get(), HoldInCustody);
	}

	public static DeliveryTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryTypeCode[] values() {
		DeliveryTypeCode[] values = new DeliveryTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryTypeCode> {
		@Override
		public DeliveryTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}