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
import com.tools20022.repository.codeset.DeliveryReturnCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of delivery return.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode#UnrecognisedDelivery
 * DeliveryReturnCode.mmUnrecognisedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode#WrongQuantity
 * DeliveryReturnCode.mmWrongQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode#WrongSettlementAmount
 * DeliveryReturnCode.mmWrongSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode#PartialDelivery
 * DeliveryReturnCode.mmPartialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode#AccountMissing
 * DeliveryReturnCode.mmAccountMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode#DueBiillMissing
 * DeliveryReturnCode.mmDueBiillMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode#PartialReturn
 * DeliveryReturnCode.mmPartialReturn}</li>
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
 * <li>"UNRE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryReturnCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of delivery return."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryReturnCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Original delivery is not recognized.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original delivery is not recognized."</li>
	 * </ul>
	 */
	public static final DeliveryReturnCode UnrecognisedDelivery = new DeliveryReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedDelivery";
			definition = "Original delivery is not recognized.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturnCode.mmObject();
			codeName = "UNRE";
		}
	};
	/**
	 * Wrong quantity delivered in the original instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wrong quantity delivered in the original instruction."</li>
	 * </ul>
	 */
	public static final DeliveryReturnCode WrongQuantity = new DeliveryReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongQuantity";
			definition = "Wrong quantity delivered in the original instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturnCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Wrong settlement amount settled in the original delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wrong settlement amount settled in the original delivery."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryReturnCode WrongSettlementAmount = new DeliveryReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSettlementAmount";
			definition = "Wrong settlement amount settled in the original delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturnCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Only a portion of the original transaction quantity was delivered by the
	 * Central Securities Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a portion of the original transaction quantity was delivered by the Central Securities Depository (CSD)."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryReturnCode PartialDelivery = new DeliveryReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDelivery";
			definition = "Only a portion of the original transaction quantity was delivered by the Central Securities Depository (CSD).";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturnCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Account information is missing in the original delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account information is missing in the original delivery."</li>
	 * </ul>
	 */
	public static final DeliveryReturnCode AccountMissing = new DeliveryReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountMissing";
			definition = "Account information is missing in the original delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturnCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Due bill information missing in the original delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBiillMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due bill information missing in the original delivery."</li>
	 * </ul>
	 */
	public static final DeliveryReturnCode DueBiillMissing = new DeliveryReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBiillMissing";
			definition = "Due bill information missing in the original delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturnCode.mmObject();
			codeName = "DUEB";
		}
	};
	/**
	 * Portion of the original transaction quantity was returned by the
	 * receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the original transaction quantity was returned by the receiver."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryReturnCode PartialReturn = new DeliveryReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReturn";
			definition = "Portion of the original transaction quantity was returned by the receiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturnCode.mmObject();
			codeName = "PARD";
		}
	};
	final static private LinkedHashMap<String, DeliveryReturnCode> codesByName = new LinkedHashMap<>();

	protected DeliveryReturnCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UNRE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryReturnCode";
				definition = "Specifies the type of delivery return.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryReturnCode.UnrecognisedDelivery, com.tools20022.repository.codeset.DeliveryReturnCode.WrongQuantity,
						com.tools20022.repository.codeset.DeliveryReturnCode.WrongSettlementAmount, com.tools20022.repository.codeset.DeliveryReturnCode.PartialDelivery, com.tools20022.repository.codeset.DeliveryReturnCode.AccountMissing,
						com.tools20022.repository.codeset.DeliveryReturnCode.DueBiillMissing, com.tools20022.repository.codeset.DeliveryReturnCode.PartialReturn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnrecognisedDelivery.getCodeName().get(), UnrecognisedDelivery);
		codesByName.put(WrongQuantity.getCodeName().get(), WrongQuantity);
		codesByName.put(WrongSettlementAmount.getCodeName().get(), WrongSettlementAmount);
		codesByName.put(PartialDelivery.getCodeName().get(), PartialDelivery);
		codesByName.put(AccountMissing.getCodeName().get(), AccountMissing);
		codesByName.put(DueBiillMissing.getCodeName().get(), DueBiillMissing);
		codesByName.put(PartialReturn.getCodeName().get(), PartialReturn);
	}

	public static DeliveryReturnCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryReturnCode[] values() {
		DeliveryReturnCode[] values = new DeliveryReturnCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryReturnCode> {
		@Override
		public DeliveryReturnCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryReturnCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}