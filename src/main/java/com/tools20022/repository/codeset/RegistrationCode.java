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
import com.tools20022.repository.codeset.RegistrationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
 * conditions of a restriction processing type in the market infrastructure
 * platform.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#StreetName
 * RegistrationCode.StreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#Registered
 * RegistrationCode.Registered}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RegistrationCode#PartyHold
 * RegistrationCode.PartyHold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RegistrationCode#CSDHold
 * RegistrationCode.CSDHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#ConditionalDelivery
 * RegistrationCode.ConditionalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#CSDValidation
 * RegistrationCode.CSDValidation}</li>
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
 * <li>"NREG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegistrationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegistrationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Hold the securities in street name. If there is a standing instruction in
	 * place to register on receipt, then this standing instruction is to be
	 * ignored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hold the securities in street name. If there is a standing instruction in place to register on receipt, then this standing instruction is to be ignored."
	 * </li>
	 * </ul>
	 */
	public static final RegistrationCode StreetName = new RegistrationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Hold the securities in street name. If there is a standing instruction in place to register on receipt, then this standing instruction is to be ignored.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationCode.mmObject();
			codeName = "NREG";
		}
	};
	/**
	 * Register on receipt. If there is a standing instruction in place to hold
	 * the securities in street name, then this standing instruction is to be
	 * ignored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Register on receipt. If there is a standing instruction in place to hold the securities in street name, then this standing instruction is to be ignored."
	 * </li>
	 * </ul>
	 */
	public static final RegistrationCode Registered = new RegistrationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registered";
			definition = "Register on receipt. If there is a standing instruction in place to hold the securities in street name, then this standing instruction is to be ignored.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationCode.mmObject();
			codeName = "YREG";
		}
	};
	/**
	 * You or your party set the instruction in a hold/frozen/preadvice mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTYH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "You or your party set the instruction in a hold/frozen/preadvice mode."</li>
	 * </ul>
	 */
	public static final RegistrationCode PartyHold = new RegistrationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyHold";
			definition = "You or your party set the instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationCode.mmObject();
			codeName = "PTYH";
		}
	};
	/**
	 * Central securities depository sets the instruction in a
	 * hold/frozen/preadvice mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Central securities depository sets the instruction in a hold/frozen/preadvice mode."
	 * </li>
	 * </ul>
	 */
	public static final RegistrationCode CSDHold = new RegistrationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSDHold";
			definition = "Central securities depository sets the instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationCode.mmObject();
			codeName = "CSDH";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditional delivery rules in the market infrastructure platform for
	 * conditional delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery."
	 * </li>
	 * </ul>
	 */
	public static final RegistrationCode ConditionalDelivery = new RegistrationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConditionalDelivery";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationCode.mmObject();
			codeName = "CDEL";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditions of a restriction processing type in the market infrastructure
	 * platform.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform."
	 * </li>
	 * </ul>
	 */
	public static final RegistrationCode CSDValidation = new RegistrationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSDValidation";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegistrationCode.mmObject();
			codeName = "CVAL";
		}
	};
	final static private LinkedHashMap<String, RegistrationCode> codesByName = new LinkedHashMap<>();

	protected RegistrationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NREG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegistrationCode";
				definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegistrationCode.StreetName, com.tools20022.repository.codeset.RegistrationCode.Registered, com.tools20022.repository.codeset.RegistrationCode.PartyHold,
						com.tools20022.repository.codeset.RegistrationCode.CSDHold, com.tools20022.repository.codeset.RegistrationCode.ConditionalDelivery, com.tools20022.repository.codeset.RegistrationCode.CSDValidation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StreetName.getCodeName().get(), StreetName);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(PartyHold.getCodeName().get(), PartyHold);
		codesByName.put(CSDHold.getCodeName().get(), CSDHold);
		codesByName.put(ConditionalDelivery.getCodeName().get(), ConditionalDelivery);
		codesByName.put(CSDValidation.getCodeName().get(), CSDValidation);
	}

	public static RegistrationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegistrationCode[] values() {
		RegistrationCode[] values = new RegistrationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegistrationCode> {
		@Override
		public RegistrationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegistrationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}