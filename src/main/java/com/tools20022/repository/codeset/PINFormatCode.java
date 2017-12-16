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
import com.tools20022.repository.codeset.PINFormatCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * PIN (Personal Identification Number) format used to encrypt the PIN block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ISO0
 * PINFormatCode.mmISO0}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ISO1
 * PINFormatCode.mmISO1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ISO2
 * PINFormatCode.mmISO2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ISO3
 * PINFormatCode.mmISO3}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ISO4
 * PINFormatCode.mmISO4}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ISO5
 * PINFormatCode.mmISO5}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ANSI0
 * PINFormatCode.mmANSI0}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#Bancomat
 * PINFormatCode.mmBancomat}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#Banksys
 * PINFormatCode.mmBanksys}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#Diebold
 * PINFormatCode.mmDiebold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#DieboldCO
 * PINFormatCode.mmDieboldCO}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ECI2
 * PINFormatCode.mmECI2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#ECI3
 * PINFormatCode.mmECI3}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#EMVRSA
 * PINFormatCode.mmEMVRSA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#IBM3624
 * PINFormatCode.mmIBM3624}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#VISA2
 * PINFormatCode.mmVISA2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#VISA3
 * PINFormatCode.mmVISA3}</li>
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
 * <li>"ISO0"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PINFormatCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "PIN (Personal Identification Number) format used to encrypt the PIN block."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PINFormatCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * PIN diversified with the card account number, conforming to the standard
	 * ISO 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN diversified with the card account number, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final PINFormatCode ISO0 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO0";
			definition = "PIN diversified with the card account number, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ISO0";
		}
	};
	/**
	 * PIN completed with random padding characters, conforming to the standard
	 * ISO 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN completed with random padding characters, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final PINFormatCode ISO1 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO1";
			definition = "PIN completed with random padding characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ISO1";
		}
	};
	/**
	 * PIN without diversification characters, conforming to the standard ISO
	 * 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN without diversification characters, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final PINFormatCode ISO2 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO2";
			definition = "PIN without diversification characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ISO2";
		}
	};
	/**
	 * PIN diversified with the card account number and random characters,
	 * conforming to the standard ISO 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final PINFormatCode ISO3 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO3";
			definition = "PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ISO3";
		}
	};
	/**
	 * PIN format used with AES encryption, conforming to the new ISO SC2
	 * format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN format used with AES encryption, conforming to the new ISO SC2 format."
	 * </li>
	 * </ul>
	 */
	public static final PINFormatCode ISO4 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO4";
			definition = "PIN format used with AES encryption, conforming to the new ISO SC2 format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ISO4";
		}
	};
	/**
	 * Alternative PIN format used with AES encryption, conforming to the new
	 * ISO SC2 format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format."
	 * </li>
	 * </ul>
	 */
	public static final PINFormatCode ISO5 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO5";
			definition = "Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ISO5";
		}
	};
	/**
	 * ANSI 0 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ANSI0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ANSI 0 PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode ANSI0 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ANSI0";
			definition = "ANSI 0 PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ANSI";
		}
	};
	/**
	 * Italian Bancomat PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BNCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bancomat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Italian Bancomat PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode Bancomat = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bancomat";
			definition = "Italian Bancomat PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "BNCM";
		}
	};
	/**
	 * Banksys PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Banksys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Banksys PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode Banksys = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Banksys";
			definition = "Banksys PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "BKSY";
		}
	};
	/**
	 * Diebold PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Diebold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Diebold PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode Diebold = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diebold";
			definition = "Diebold PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "DBLD";
		}
	};
	/**
	 * Diebold CO PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DieboldCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Diebold CO PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode DieboldCO = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DieboldCO";
			definition = "Diebold CO PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "DBLC";
		}
	};
	/**
	 * ECI2 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECI2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECI2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ECI2 PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode ECI2 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI2";
			definition = "ECI2 PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ECI2";
		}
	};
	/**
	 * ECI3 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECI3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECI3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ECI3 PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode ECI3 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI3";
			definition = "ECI3 PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "ECI3";
		}
	};
	/**
	 * EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key
	 * for the PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN."
	 * </li>
	 * </ul>
	 */
	public static final PINFormatCode EMVRSA = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVRSA";
			definition = "EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "EMVS";
		}
	};
	/**
	 * IBM 3624 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBM3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBM3624"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "IBM 3624 PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode IBM3624 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBM3624";
			definition = "IBM 3624 PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "IBM3";
		}
	};
	/**
	 * VISA2 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VIS2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VISA2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "VISA2 PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode VISA2 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA2";
			definition = "VISA2 PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "VIS2";
		}
	};
	/**
	 * VISA3 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VIS3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VISA3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "VISA3 PIN block format."</li>
	 * </ul>
	 */
	public static final PINFormatCode VISA3 = new PINFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA3";
			definition = "VISA3 PIN block format.";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormatCode.mmObject();
			codeName = "VIS3";
		}
	};
	final static private LinkedHashMap<String, PINFormatCode> codesByName = new LinkedHashMap<>();

	protected PINFormatCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ISO0");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PINFormatCode";
				definition = "PIN (Personal Identification Number) format used to encrypt the PIN block.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PINFormatCode.ISO0, com.tools20022.repository.codeset.PINFormatCode.ISO1, com.tools20022.repository.codeset.PINFormatCode.ISO2,
						com.tools20022.repository.codeset.PINFormatCode.ISO3, com.tools20022.repository.codeset.PINFormatCode.ISO4, com.tools20022.repository.codeset.PINFormatCode.ISO5,
						com.tools20022.repository.codeset.PINFormatCode.ANSI0, com.tools20022.repository.codeset.PINFormatCode.Bancomat, com.tools20022.repository.codeset.PINFormatCode.Banksys,
						com.tools20022.repository.codeset.PINFormatCode.Diebold, com.tools20022.repository.codeset.PINFormatCode.DieboldCO, com.tools20022.repository.codeset.PINFormatCode.ECI2,
						com.tools20022.repository.codeset.PINFormatCode.ECI3, com.tools20022.repository.codeset.PINFormatCode.EMVRSA, com.tools20022.repository.codeset.PINFormatCode.IBM3624,
						com.tools20022.repository.codeset.PINFormatCode.VISA2, com.tools20022.repository.codeset.PINFormatCode.VISA3);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ISO0.getCodeName().get(), ISO0);
		codesByName.put(ISO1.getCodeName().get(), ISO1);
		codesByName.put(ISO2.getCodeName().get(), ISO2);
		codesByName.put(ISO3.getCodeName().get(), ISO3);
		codesByName.put(ISO4.getCodeName().get(), ISO4);
		codesByName.put(ISO5.getCodeName().get(), ISO5);
		codesByName.put(ANSI0.getCodeName().get(), ANSI0);
		codesByName.put(Bancomat.getCodeName().get(), Bancomat);
		codesByName.put(Banksys.getCodeName().get(), Banksys);
		codesByName.put(Diebold.getCodeName().get(), Diebold);
		codesByName.put(DieboldCO.getCodeName().get(), DieboldCO);
		codesByName.put(ECI2.getCodeName().get(), ECI2);
		codesByName.put(ECI3.getCodeName().get(), ECI3);
		codesByName.put(EMVRSA.getCodeName().get(), EMVRSA);
		codesByName.put(IBM3624.getCodeName().get(), IBM3624);
		codesByName.put(VISA2.getCodeName().get(), VISA2);
		codesByName.put(VISA3.getCodeName().get(), VISA3);
	}

	public static PINFormatCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PINFormatCode[] values() {
		PINFormatCode[] values = new PINFormatCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PINFormatCode> {
		@Override
		public PINFormatCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PINFormatCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}