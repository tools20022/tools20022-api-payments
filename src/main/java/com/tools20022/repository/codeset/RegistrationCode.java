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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#mmStreetName
 * RegistrationCode.mmStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#mmRegistered
 * RegistrationCode.mmRegistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#mmPartyHold
 * RegistrationCode.mmPartyHold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RegistrationCode#mmCSDHold
 * RegistrationCode.mmCSDHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#mmConditionalDelivery
 * RegistrationCode.mmConditionalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode#mmCSDValidation
 * RegistrationCode.mmCSDValidation}</li>
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
public class RegistrationCode {

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
	public static final MMCode mmStreetName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Hold the securities in street name. If there is a standing instruction in place to register on receipt, then this standing instruction is to be ignored.";
			owner_lazy = () -> RegistrationCode.mmObject();
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
	public static final MMCode mmRegistered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registered";
			definition = "Register on receipt. If there is a standing instruction in place to hold the securities in street name, then this standing instruction is to be ignored.";
			owner_lazy = () -> RegistrationCode.mmObject();
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
	 * "You or your party set the  instruction in a hold/frozen/preadvice mode."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartyHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyHold";
			definition = "You or your party set the  instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> RegistrationCode.mmObject();
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
	 * "Central securities depository sets the  instruction in a hold/frozen/preadvice mode."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCSDHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSDHold";
			definition = "Central securities depository sets the  instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> RegistrationCode.mmObject();
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
	public static final MMCode mmConditionalDelivery = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConditionalDelivery";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.";
			owner_lazy = () -> RegistrationCode.mmObject();
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
	public static final MMCode mmCSDValidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSDValidation";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
			owner_lazy = () -> RegistrationCode.mmObject();
			codeName = "CVAL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NREG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegistrationCode";
				definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
				code_lazy = () -> Arrays.asList(RegistrationCode.mmStreetName, RegistrationCode.mmRegistered, RegistrationCode.mmPartyHold, RegistrationCode.mmCSDHold, RegistrationCode.mmConditionalDelivery,
						RegistrationCode.mmCSDValidation);
			}
		});
		return mmObject_lazy.get();
	}
}